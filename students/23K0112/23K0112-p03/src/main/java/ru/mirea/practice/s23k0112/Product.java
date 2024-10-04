package ru.mirea.practice.s23k0112;

public class Product {
    private int numberInList; // Changed variable name to camelCase
    private String name;
    private String currency;
    private double price;

    public Product(int numberInList, String name, String currency, double price) {
        this.numberInList = numberInList;
        this.name = name;
        this.currency = currency;
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product information:%nNumber: %d%nName: %s%nCurrency: %s%nPrice: %.2f",
                numberInList, name, currency, price);
    }
}