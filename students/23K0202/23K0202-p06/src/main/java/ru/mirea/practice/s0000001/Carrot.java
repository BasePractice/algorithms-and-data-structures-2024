package ru.mirea.practice.s0000001;

class Carrot implements Priceable {
    private final double price;

    public Carrot(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}