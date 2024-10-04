package ru.mirea.practice.s0000006.task4;

public class Vehicle implements Priceable {
    private final String model;
    private final double basePrice;

    public Vehicle(String model, double basePrice) {
        this.model = model;
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return String.format("Vehicle{model='%s', price=%.2f}", model, basePrice);
    }
}
