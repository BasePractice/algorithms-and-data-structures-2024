package ru.mirea.practice.s23k0143;

abstract class Furniture {
    protected String name;
    protected double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();
}

