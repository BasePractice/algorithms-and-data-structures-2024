package ru.mirea.practice.s0000002.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothesSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка: Размер - " + size + ", Цена - " + price + ", Цвет - " + color);
    }
}
