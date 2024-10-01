package ru.mirea.practice.s23k0350.lab4.task2.task2;

public abstract class Clothes {
    protected ClothingSize size;
    protected double price;
    protected String color;

    public Clothes(ClothingSize size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public abstract void printInfo();
}
