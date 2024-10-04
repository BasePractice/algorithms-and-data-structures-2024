package ru.mirea.practice.s0000001.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void checkout() {
        double total = 0;
        System.out.println("Товары в корзине:");
        for (Product product : products) {
            System.out.printf("%s - %.2f%n", product.getName(), product.getPrice());
            total += product.getPrice();
        }
        System.out.printf("Итого: %.2f%n", total);
    }
}

class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Товар 1", 100.0));
        productList.add(new Product("Товар 2", 150.0));
        productList.add(new Product("Товар 3", 200.0));

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.println("Добро пожаловать в интернет-магазин, " + login);
        System.out.println("Список товаров:");
        for (int i = 0; i < productList.size(); i++) {
            System.out.printf("%d: %s - %.2f%n", i + 1, productList.get(i).getName(), productList.get(i).getPrice());
        }

        System.out.print("Выберите товар для добавления в корзину (номер): ");
        int choice = scanner.nextInt();
        if (choice > 0 && choice <= productList.size()) {
            cart.addProduct(productList.get(choice - 1));
            System.out.println("Товар добавлен в корзину.");
        }

        cart.checkout();
    }
}
