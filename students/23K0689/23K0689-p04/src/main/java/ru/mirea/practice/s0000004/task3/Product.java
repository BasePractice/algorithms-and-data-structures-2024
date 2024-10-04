package ru.mirea.practice.s0000004.task3;

public class Product {
    private String name;
    private double price;
    private Catalogs catalog;

    public Product(String name, double price, Catalogs catalog) {
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

    public Catalogs getCatalog() {
        return catalog;
    }

    @Override
    public String toString() {
        return "Товар: " + name + ", Цена: " + price + ", Категория: " + catalog.getCatalogName();
    }
}