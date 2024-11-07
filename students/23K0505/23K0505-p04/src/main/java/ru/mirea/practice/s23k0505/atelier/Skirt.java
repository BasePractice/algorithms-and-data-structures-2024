package ru.mirea.practice.s23k0505.atelier;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSizes size, float cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("Юбка %s", getDescription());
    }
}