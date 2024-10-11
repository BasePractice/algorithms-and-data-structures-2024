package ru.mirea.practice.s0000001.task1;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка для мужчин: Размер: " + getSize() + ", Цена: " + getPrice() + ", Цвет: " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка для женщин: Размер: " + getSize() + ", Цена: " + getPrice() + ", Цвет: " + getColor());
    }
}
