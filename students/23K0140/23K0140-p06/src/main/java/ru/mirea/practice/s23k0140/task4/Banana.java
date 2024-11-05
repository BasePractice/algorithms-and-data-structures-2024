package ru.mirea.practice.s23k0140.task4;

class Banana implements Priceable {
    private final double price;

    public Banana(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}