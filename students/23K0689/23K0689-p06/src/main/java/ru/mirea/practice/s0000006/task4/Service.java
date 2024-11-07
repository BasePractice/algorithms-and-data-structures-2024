package ru.mirea.practice.s0000006.task4;

public class Service implements Priceable {
    private final String description;
    private final double hourlyRate;
    private final int hours;

    public Service(String description, double hourlyRate, int hours) {
        this.description = description;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double getPrice() {
        return hourlyRate * hours;
    }

    @Override
    public String toString() {
        return String.format("Service{description='%s', price=%.2f}", description, getPrice());
    }
}
