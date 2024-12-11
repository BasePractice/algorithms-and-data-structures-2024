package ru.mirea.practice.s0000001.n2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка, размер: " + size + ", цена: " + price + ", цвет: " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка, размер: " + size + ", цена: " + price + ", цвет: " + color);
    }
}