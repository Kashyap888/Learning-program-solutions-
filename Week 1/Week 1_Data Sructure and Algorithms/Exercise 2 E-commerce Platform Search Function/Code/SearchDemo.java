import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear search by product name
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary search by product name (requires sorted array)
    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Watch", "Accessories")
        };

        // Linear search
        Product result1 = linearSearch(products, "Shoes");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

        // Sort array for binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary search
        Product result2 = binarySearch(products, "Shoes");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));
    }
}
