package ru.mirea.practice.u23k1158.t4;

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
