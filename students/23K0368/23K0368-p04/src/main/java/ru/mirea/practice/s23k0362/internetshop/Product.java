package ru.mirea.practice.s23k0362.internetshop;

public class Product {
    private String name;
    private ProductCategory category;
    private double price;

    public Product(String name, ProductCategory category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}