package ru.mirea.practice.s0000002;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Одеваем мужчину: Штаны, размер: %s, цвет: %s, цена: %.2f%n", size, color, price);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Одеваем женщину: Штаны, размер: %s, цвет: %s, цена: %.2f%n", size, color, price);
    }
}
