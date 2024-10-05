package ru.mirea.practice.s23L0908.atelie;

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
