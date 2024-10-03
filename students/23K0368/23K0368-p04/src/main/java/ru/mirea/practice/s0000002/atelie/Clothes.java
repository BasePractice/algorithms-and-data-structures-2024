package ru.mirea.practice.s0000002.atelie;

public abstract class Clothes {
    Size size;
    double price;
    String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

}
