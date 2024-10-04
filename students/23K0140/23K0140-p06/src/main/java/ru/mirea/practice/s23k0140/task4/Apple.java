package ru.mirea.practice.s23k0140.task4;

class Apple implements Priceable {
    private final double price;

    public Apple(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}