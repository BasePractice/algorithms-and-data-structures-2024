package ru.mirea.practice.s23K0135.n2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка, размер: " + size + ", цена: " + price + ", цвет: " + color);
    }
}
