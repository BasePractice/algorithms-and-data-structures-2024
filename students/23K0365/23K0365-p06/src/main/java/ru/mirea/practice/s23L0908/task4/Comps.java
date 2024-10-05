package ru.mirea.practice.s23L0908.task4;

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
