import java.util.*;


class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | ₹" + price;
    }
}

public class Lab11 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", 65000));
        products.add(new Product(102, "Phone", 35000));
        products.add(new Product(103, "Headphones", 2000));
        products.add(new Product(104, "Monitor", 12000));

        System.out.println("Original List:");
        products.forEach(p -> System.out.println(p));

        
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price:");
        products.forEach(p -> System.out.println(p));

       
        products.sort((p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("\nSorted by Name:");
        products.forEach(p -> System.out.println(p));

        
        System.out.println("\nProducts above ₹10,000:");
        products.forEach(p -> {
            if (p.price > 10000)
                System.out.println(p);
        });
    }
}