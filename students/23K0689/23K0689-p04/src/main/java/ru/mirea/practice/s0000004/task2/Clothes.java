package ru.mirea.practice.s0000004.task2;

public abstract class Clothes {
    protected ClothesSize size;
    protected double price;
    protected String color;

    public Clothes(ClothesSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public ClothesSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
