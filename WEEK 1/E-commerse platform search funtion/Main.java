public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "iPhone", "Electronics"),
            new Product(102, "Galaxy", "Electronics"),
            new Product(103, "Nike Shoes", "Footwear"),
            new Product(104, "Washing Machine", "Appliance")
        };

        Product result1 = SearchUtils.linearSearch(products, "Nike Shoes");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Product result2 = SearchUtils.binarySearch(products, "iphone");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
