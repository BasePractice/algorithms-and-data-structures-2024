package ru.mirea.practice.s23L0908;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в футболку");
    }
}
