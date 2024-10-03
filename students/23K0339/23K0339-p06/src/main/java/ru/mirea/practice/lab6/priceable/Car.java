package ru.mirea.practice.lab6.priceable;

public class Car implements Priceable {
    private final String name;
    private final double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price;
    }
}
