package ru.mirea.practice.s23k0140.task4;

class Cherry implements Priceable {
    private final double price;

    public Cherry(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}