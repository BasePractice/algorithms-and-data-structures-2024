package ru.mirea.practice.s23k0690.task2;

// Класс Service, реализующий интерфейс Priceable  
public class Service implements Priceable {
    private String description;
    private double hourlyRate;

    public Service(String description, double hourlyRate) {
        this.description = description;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        return hourlyRate;
    }

    public String getDescription() {
        return description;
    }
}
