package ru.mirea.practice.s23k0143;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваю мужчину в штаны цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }

    public void dressWomen() {
        System.out.println("Одеваю женщину в штаны цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }
}