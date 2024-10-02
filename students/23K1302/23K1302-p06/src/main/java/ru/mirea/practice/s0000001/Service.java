package ru.mirea.practice.s0000001;

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

    public String getDescription() {
        return description;
    }
}
