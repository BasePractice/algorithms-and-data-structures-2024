package ru.mirea.practice4;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: размер " + getSize() + ", цвет " + getColor() + ", цена " + getPrice());
    }
}
