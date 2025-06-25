import java.util.*;

class Product {
    String id;
    String description;

    public Product(String id, String description) {
        this.id = id;
        this.description = description.toLowerCase();
    }
}

class ECommerceSearch {
    Map<String, Set<String>> invertedIndex = new HashMap<>();
    Map<String, String> productDescriptions = new HashMap<>();

    public void addProduct(Product product) {
        productDescriptions.put(product.id, product.description);

        String[] words = product.description.split("\\s+");
        for (String word : words) {
            invertedIndex
                .computeIfAbsent(word, k -> new HashSet<>())
                .add(product.id);
        }
    }

    public Set<String> search(String query) {
        return invertedIndex.getOrDefault(query.toLowerCase(), new HashSet<>());
    }

    public String correctQuery(String query) {
        int minDist = Integer.MAX_VALUE;
        String corrected = query;

        for (String word : invertedIndex.keySet()) {
            int dist = levenshtein(query.toLowerCase(), word);
            if (dist < minDist) {
                minDist = dist;
                corrected = word;
            }
        }
        return corrected;
    }

    private int levenshtein(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i <= a.length(); i++)
            for (int j = 0; j <= b.length(); j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
                                 Math.min(dp[i - 1][j], dp[i][j - 1]));
            }

        return dp[a.length()][b.length()];
    }

    public List<String> autocomplete(String prefix) {
        prefix = prefix.toLowerCase();
        List<String> suggestions = new ArrayList<>();
        for (String word : invertedIndex.keySet()) {
            if (word.startsWith(prefix)) {
                suggestions.add(word);
            }
        }
        return suggestions;
    }
}
public class Main {
    public static void main(String[] args) {
        ECommerceSearch search = new ECommerceSearch();

        search.addProduct(new Product("P001", "Red sports sneaker"));
        search.addProduct(new Product("P002", "Blue running shoes"));
        search.addProduct(new Product("P003", "Sneakers for women"));
        search.addProduct(new Product("P004", "Black formal shoes"));

        System.out.println("Search 'sneaker': " + search.search("sneaker"));

        String corrected = search.correctQuery("sneker");
        System.out.println("Did you mean: " + corrected);
        System.out.println("Search corrected: " + search.search(corrected));

        System.out.println("Autocomplete for 'sne': " + search.autocomplete("sne"));
    }
}

