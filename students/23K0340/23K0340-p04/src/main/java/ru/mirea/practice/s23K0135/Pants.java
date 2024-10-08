package ru.mirea.practice.s23K0135;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Sizes size, double price, String color) {
        super(size,price,color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в штаны.");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в штаны.");
    }
}
