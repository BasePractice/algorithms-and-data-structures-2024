package ru.mirea.practice.s23K0135;

public class Service implements Priceable {
    private String description;
    private double price;

    public Service(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return description + " - " + getPrice() + " USD";
    }
}

