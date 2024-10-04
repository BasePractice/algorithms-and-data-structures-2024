package ru.mirea.practice.u23k1158.t4;

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
