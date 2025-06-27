import java.util.*;

class FinancialGrowthForecast {
    public static List<Double> forecastNextNMonths(Map<String, Double> revenueData, int monthsAhead) {
        List<String> months = new ArrayList<>(revenueData.keySet());
        Collections.sort(months);

        List<Double> growthRates = new ArrayList<>();
        for (int i = 1; i < months.size(); i++) {
            double prev = revenueData.get(months.get(i - 1));
            double curr = revenueData.get(months.get(i));
            double growth = (curr - prev) / prev;
            growthRates.add(growth);
        }

        double avgGrowth = growthRates.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        double lastRevenue = revenueData.get(months.get(months.size() - 1));
        List<Double> forecast = new ArrayList<>();

        for (int i = 0; i < monthsAhead; i++) {
            lastRevenue *= (1 + avgGrowth);
            forecast.add(Math.round(lastRevenue * 100.0) / 100.0);
        }

        return forecast;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<String, Double> revenue = new HashMap<>();
        revenue.put("2025-01", 10000.0);
        revenue.put("2025-02", 11000.0);
        revenue.put("2025-03", 12100.0);
        revenue.put("2025-04", 13310.0);

        List<Double> forecast = FinancialGrowthForecast.forecastNextNMonths(revenue, 3);

        for (int i = 1; i <= forecast.size(); i++) {
            System.out.println("Forecast Month " + i + ": $" + forecast.get(i - 1));
        }
    }
}