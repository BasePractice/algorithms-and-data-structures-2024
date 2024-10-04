package ru.mirea.practice.s23k0169.t2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть женщину в юбку: " + getInfo());
    }

    @Override
    public String getInfo() {
        return "Юбка, размер: " + size + ", цена: " + price + ", цвет: " + color;
    }
}