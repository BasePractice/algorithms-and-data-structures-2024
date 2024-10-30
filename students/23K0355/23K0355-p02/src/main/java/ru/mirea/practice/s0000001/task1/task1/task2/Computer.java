package ru.mirea.practice.s0000001.task1.task1.task2;

public class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "brand='" + brand + '\''
                + ", model='" + model + '\''
                + ", price=" + price
                + '}';
    }
}