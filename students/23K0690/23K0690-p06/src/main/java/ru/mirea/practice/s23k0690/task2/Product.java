package ru.mirea.practice.s23k0690.task2;

// Класс Product, реализующий интерфейс Priceable  
public class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
