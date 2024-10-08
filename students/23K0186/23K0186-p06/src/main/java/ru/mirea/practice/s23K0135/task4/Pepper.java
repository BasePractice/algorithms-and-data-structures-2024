package ru.mirea.practice.s23K0135.task4;

public class Pepper implements Pricable {
    public double getPrice() {
        return price;
    }

    private double price;

    Pepper(double price) {
        this.price = price;
    }
}
