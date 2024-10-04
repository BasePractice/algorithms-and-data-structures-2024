package ru.mirea.practice.s0000004.task3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
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

    public void checkout() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста. Покупка невозможна.");
            return;
        }

        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }

        System.out.println("Общая сумма покупки: " + total);
        System.out.println("Покупка завершена!");
        products.clear();
    }
}
