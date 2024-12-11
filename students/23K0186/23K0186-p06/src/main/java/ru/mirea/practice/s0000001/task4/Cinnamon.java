package ru.mirea.practice.s0000001.task4;

public class Cinnamon implements Pricable {
    public double getPrice() {
        return price;
    }

    private double price;

    Cinnamon(double price) {
        this.price = price;
    }
}
