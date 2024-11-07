package ru.mirea.practice.s23k0505.atelier;

public class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSizes size, float cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Галстук %s", getDescription());
    }
}
