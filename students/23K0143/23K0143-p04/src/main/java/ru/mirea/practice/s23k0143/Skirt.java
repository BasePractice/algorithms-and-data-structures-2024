package ru.mirea.practice.s23k0143;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressWomen() {
        System.out.println("Одеваю женщину в юбку цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }
}
