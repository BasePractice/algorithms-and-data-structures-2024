package ru.mirea.practice.s0000004.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(ClothesSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: Размер - " + size + ", Цена - " + price + ", Цвет - " + color);
    }
}
