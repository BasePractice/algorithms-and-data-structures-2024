package ru.mirea.practice.s23K0135;

public abstract class Furniture {
    protected String material;
    protected String colour;
    protected double price;

    public Furniture(String material, String colour, double price) {
        this.material = material;
        this.colour = colour;
        this.price = price;
    }

    public abstract void furniture();
}


