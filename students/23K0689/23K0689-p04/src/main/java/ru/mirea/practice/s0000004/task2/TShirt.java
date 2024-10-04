package ru.mirea.practice.s0000004.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothesSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: Размер - " + size + ", Цена - " + price + ", Цвет - " + color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женская футболка: Размер - " + size + ", Цена - " + price + ", Цвет - " + color);
    }
}