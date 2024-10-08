package ru.mirea.practice.s23K0135.task4;

public class Salt implements Pricable {
    public double getPrice() {
        return price;
    }

    private double price;

    Salt(double price) {
        this.price = price;
    }
}
