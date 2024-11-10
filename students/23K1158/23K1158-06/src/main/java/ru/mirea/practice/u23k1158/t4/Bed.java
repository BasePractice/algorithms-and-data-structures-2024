package ru.mirea.practice.u23k1158.t4;

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
