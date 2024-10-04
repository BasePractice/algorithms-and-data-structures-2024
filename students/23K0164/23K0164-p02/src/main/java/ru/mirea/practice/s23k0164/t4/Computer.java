package ru.mirea.practice.s23k0164.t4;

import java.util.Locale;

public class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public boolean matches(String criteria) {
        return brand.toLowerCase(Locale.ROOT).contains(criteria.toLowerCase(Locale.ROOT))
                || model.toLowerCase(Locale.ROOT).contains(criteria.toLowerCase(Locale.ROOT));
    }

    @Override
    public String toString() {
        return "Компьютер [марка=" + brand + ", модель=" + model + ", цена=" + price + "]";
    }
}