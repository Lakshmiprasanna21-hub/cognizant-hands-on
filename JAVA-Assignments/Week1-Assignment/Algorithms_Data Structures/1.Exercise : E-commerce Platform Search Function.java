import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name.toLowerCase();
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: ₹" + price);
    }
}

public class ECommerceSearch {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 65000));
        productList.add(new Product("Smartphone", 25000));
        productList.add(new Product("Smartwatch", 5000));
        productList.add(new Product("Headphones", 2000));
        productList.add(new Product("Tablet", 30000));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Search product by name: ");
        String query = scanner.nextLine().toLowerCase();

        boolean found = false;
        for (Product product : productList) {
            if (product.name.contains(query)) {
                product.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found matching: " + query);
        }
    }
}
