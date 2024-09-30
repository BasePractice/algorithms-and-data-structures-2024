package ru.mirea.practice4;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка для мужчин: размер " + getSize() + ", цвет " + getColor() + ", цена " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка для женщин: размер " + getSize() + ", цвет " + getColor() + ", цена " + getPrice());
    }
}