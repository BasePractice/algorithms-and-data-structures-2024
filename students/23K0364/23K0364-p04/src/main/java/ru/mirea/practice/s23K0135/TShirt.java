package ru.mirea.practice.s23K0135;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Одеваем мужчину: Футболка, размер: %s, цвет: %s, цена: %.2f%n", size, color, price);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Одеваем женщину: Футболка, размер: %s, цвет: %s, цена: %.2f%n", size, color, price);
    }
}
