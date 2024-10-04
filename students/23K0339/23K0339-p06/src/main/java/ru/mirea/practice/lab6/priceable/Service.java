package ru.mirea.practice.lab6.priceable;

public class Service implements Priceable {
    private final String serviceName;
    private final double servicePrice;

    public Service(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    @Override
    public double getPrice() {
        return servicePrice;
    }

    @Override
    public String toString() {
        return "Service: " + serviceName + ", Price: $" + servicePrice + " per day";
    }
}

