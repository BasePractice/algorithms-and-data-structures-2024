package ru.mirea.practice.s23L0908.task3;


public abstract class Furniture {
    protected String name;
    protected double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }
}


