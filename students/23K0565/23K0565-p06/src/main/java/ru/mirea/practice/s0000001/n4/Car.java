package ru.mirea.practice.s0000001.n4;

public class Car implements Priceable {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car: " + model + ", Price: $" + price;
    }
}