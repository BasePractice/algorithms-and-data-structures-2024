package ru.mirea.practice.s23k0143;

abstract class Clothes {
    Size size;
    double price;
    String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}


