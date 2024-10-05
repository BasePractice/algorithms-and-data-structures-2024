package ru.mirea.practice.s23L0908;

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
