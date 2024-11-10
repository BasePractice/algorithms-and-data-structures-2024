package ru.mirea.practice.u23k1158.t9;

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
