package ru.mirea.practice.s23l0908.task3;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private final List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart:");
            double total = 0;
            for (Product product : items) {
                System.out.println("- " + product);
                total += product.getPrice();
            }
            System.out.println("Total: $" + total);
        }
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty. Add products to proceed to checkout.");
        } else {
            showCart();
            System.out.println("Thank you for your purchase!");
            items.clear(); // Empty the cart after purchase
        }
    }
}
