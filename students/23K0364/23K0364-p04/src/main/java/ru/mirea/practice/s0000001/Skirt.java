package ru.mirea.practice.s0000001;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Одеваем женщину: Юбка, размер: %s, цвет: %s, цена: %.2f%n", size, color, price);
    }
}
