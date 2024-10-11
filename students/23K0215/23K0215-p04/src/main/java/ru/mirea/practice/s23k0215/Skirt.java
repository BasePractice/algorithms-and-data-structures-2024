package ru.mirea.practice.s23k0215;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одевает юбку. " + this);
    }
}