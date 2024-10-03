package ru.mirea.practice.s0000001.task4;

public class Comps implements Priceable {
    private int price;
    String model;

    public Comps(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
