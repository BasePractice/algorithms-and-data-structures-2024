package ru.mirea.practice.s0000002;

public class Product {
    private String name;
    private double priceInUsd;

    public Product(String name, double priceInUsd) {
        this.name = name;
        this.priceInUsd = priceInUsd;
    }

    public String getName() {
        return name;
    }

    public double getPriceInUsd() {
        return priceInUsd;
    }
}
