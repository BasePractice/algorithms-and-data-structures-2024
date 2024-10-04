package ru.mirea.practice.s0000001.task1;

class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: Размер: " + getSize() + ", Цена: " + getPrice() + ", Цвет: " + getColor());
    }
}
