package ru.mirea.practice.s23k0505.atelier;


import java.text.NumberFormat;
import java.util.Locale;

public abstract class Clothes {
    ClothingSizes size;
    float cost;
    String color;

    public Clothes(ClothingSizes size, float cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public String getDescription() {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("ru", "Ru"));
        return String.format("%s, Цена: %s, Цвет: %s", size, format.format(cost), color);
    }
}