package ru.mirea.practice.s23k0164.t3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " добавлен в корзину.");
    }

    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }
        System.out.println("Товары в корзине:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void clearCart() {
        products.clear();
        System.out.println("Корзина очищена.");
    }

    public List<Product> getProducts() {
        return products;
    }

}