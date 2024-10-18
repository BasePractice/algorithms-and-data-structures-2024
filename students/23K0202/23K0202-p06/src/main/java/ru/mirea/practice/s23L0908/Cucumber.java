package ru.mirea.practice.s23L0908;

class Cucumber implements Priceable {
    private final double price;

    public Cucumber(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}