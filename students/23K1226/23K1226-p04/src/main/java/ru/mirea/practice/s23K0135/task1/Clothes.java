package ru.mirea.practice.s23K0135.task1;

abstract class Clothes {
    private Sizes size;
    private double price;
    private String color;

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
