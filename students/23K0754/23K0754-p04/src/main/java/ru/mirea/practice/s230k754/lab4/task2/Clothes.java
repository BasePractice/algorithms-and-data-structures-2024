package ru.mirea.practice.s230k754.lab4.task2;

public abstract class Clothes {
    private double price;
    private int size;
    private String color;

    public Clothes(double price, int size, String color) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
