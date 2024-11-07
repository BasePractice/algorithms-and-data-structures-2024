package ru.mirea.practice.s23k0130.task4;

class Wardrobe implements Priceable {
    private final double price;

    public Wardrobe(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
