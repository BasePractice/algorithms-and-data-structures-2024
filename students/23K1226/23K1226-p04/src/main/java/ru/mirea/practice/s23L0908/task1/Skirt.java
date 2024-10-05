package ru.mirea.practice.s23L0908.task1;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: Размер: " + getSize() + ", Цена: " + getPrice() + ", Цвет: " + getColor());
    }
}
