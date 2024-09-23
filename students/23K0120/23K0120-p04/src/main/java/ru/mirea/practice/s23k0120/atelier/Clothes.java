package ru.mirea.practice.s23k0120.atelier;


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


class TShirt extends Clothes implements MenClothing, WomenClothing {
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

class Pants extends Clothes implements MenClothing, WomenClothing {
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

class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSizes size, float cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.printf("Юбка %s", getDescription());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSizes size, float cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Галстук %s", getDescription());
    }
}
