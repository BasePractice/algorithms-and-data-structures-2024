package ru.mirea.practice.s23L0908.task1;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны для мужчин: Размер: " + getSize() + ", Цена: " + getPrice() + ", Цвет: " + getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны для женщин: Размер: " + getSize() + ", Цена: " + getPrice() + ", Цвет: " + getColor());
    }
}
