package ru.mirea.practice.s23k0505.atelier;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSizes size, float cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужские Брюки %s", getDescription());
    }

    @Override
    public void dressWoman() {
        System.out.printf("Женские Брюки %s", getDescription());
    }
}
