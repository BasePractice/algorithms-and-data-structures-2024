package ru.mirea.practice.s23k0823.internetshop;


public class Product {
    private String name;
    private double price;
    private Catalog catalog;

    public Product(String name, double price, Catalog catalog) {
        this.name = name;
        this.price = price;
        this.catalog = catalog;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Catalog getCatalog() {
        return catalog;
    }
}
