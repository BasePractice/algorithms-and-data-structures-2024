package ru.mirea.practice.s23L0908;

class Tomato implements Priceable {
    private final double price;

    public Tomato(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
