package ru.mirea.practice.s0000001.task4;

public class Pepper implements Pricable {
    public double getPrice() {
        return price;
    }

    private double price;

    Pepper(double price) {
        this.price = price;
    }
}
