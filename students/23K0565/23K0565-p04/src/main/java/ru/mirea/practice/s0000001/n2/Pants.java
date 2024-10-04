package ru.mirea.practice.s0000001.n2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны, размер: " + size + ", цена: " + price + ", цвет: " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны, размер: " + size + ", цена: " + price + ", цвет: " + color);
    }
}