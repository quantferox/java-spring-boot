package tasks.other.product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 10));
        products.add(new Product("Apple", 20));
        products.add(new Product("House", 5));
        products.add(new Product("Case", 2));
        products.add(new Product("Piano", 7));
        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(products);
    }
}
