package ru.mirea.practice.s0000001;

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Одеваем мужчину: Галстук, размер: %s, цвет: %s, цена: %.2f%n", size, color, price);
    }
}
