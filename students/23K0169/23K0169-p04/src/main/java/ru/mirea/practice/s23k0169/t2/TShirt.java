package ru.mirea.practice.s23k0169.t2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть мужчину в футболку: " + getInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть женщину в футболку: " + getInfo());
    }

    @Override
    public String getInfo() {
        return "Футболка, размер: " + size + ", цена: " + price + ", цвет: " + color;
    }
}