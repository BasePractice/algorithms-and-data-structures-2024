package ru.mirea.practice.s23k0130.task4;

class Armchair implements Priceable {
    private final double price;

    public Armchair(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
