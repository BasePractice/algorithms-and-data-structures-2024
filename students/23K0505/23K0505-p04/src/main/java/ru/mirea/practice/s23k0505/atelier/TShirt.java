package ru.mirea.practice.s23k0505.atelier;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSizes size, float cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужская Футболка %s", getDescription());
    }

    @Override
    public void dressWoman() {
        System.out.printf("Женская Футболка %s", getDescription());
    }
}

