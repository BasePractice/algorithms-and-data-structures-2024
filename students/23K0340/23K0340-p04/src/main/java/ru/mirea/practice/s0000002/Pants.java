package ru.mirea.practice.s0000002;

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