package ru.mirea.practice.s0000001.n4;

public class Service implements Priceable {
    private String serviceName;
    private double price;

    public Service(String serviceName, double price) {
        this.serviceName = serviceName;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Service: " + serviceName + ", Price: $" + price;
    }
}