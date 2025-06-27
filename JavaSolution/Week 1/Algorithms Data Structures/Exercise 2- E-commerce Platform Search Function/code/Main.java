import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Book", "Stationery"),
            new Product(105, "Phone", "Electronics")
        };

        
        System.out.println("Linear Search:");
        Product result1 = SearchEngine.linearSearch(products, "Keyboard");
        System.out.println(result1 != null ? result1 : "Product not found");

        
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
        System.out.println("\nBinary Search:");
        Product result2 = SearchEngine.binarySearch(products, "Keyboard");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

