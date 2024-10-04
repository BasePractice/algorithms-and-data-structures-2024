package ru.mirea.practice.s23k0169.t2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть мужчину в штаны: " + getInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть женщину в штаны: " + getInfo());
    }

    @Override
    public String getInfo() {
        return "Штаны, размер: " + size + ", цена: " + price + ", цвет: " + color;
    }
}