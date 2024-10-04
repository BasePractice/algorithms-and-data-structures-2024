package ru.mirea.practice.s23k0130.task4;

class Bed implements Priceable {
    private final double price;

    public Bed(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
