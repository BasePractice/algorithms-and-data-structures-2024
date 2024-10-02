package ru.mirea.practice.s0000001;

public abstract class Clothes {
    protected Sizes size;
    protected double price;
    protected String color;

    public Clothes(Sizes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
