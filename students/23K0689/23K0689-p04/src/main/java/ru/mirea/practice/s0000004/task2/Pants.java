package ru.mirea.practice.s0000004.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothesSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: Размер - " + size + ", Цена - " + price + ", Цвет - " + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женские штаны: Размер - " + size + ", Цена - " + price + ", Цвет - " + color);
    }
}
