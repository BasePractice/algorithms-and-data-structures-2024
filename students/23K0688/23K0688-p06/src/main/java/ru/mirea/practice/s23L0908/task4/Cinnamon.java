package ru.mirea.practice.s23L0908.task4;

public class Cinnamon implements Pricable {
    public double getPrice() {
        return price;
    }

    private double price;

    Cinnamon(double price) {
        this.price = price;
    }
}
