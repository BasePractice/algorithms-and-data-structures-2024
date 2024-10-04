package ru.mirea.practice.s23k0350.lab4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в футболку размера " + size.getDescription());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в футболку размера " + size.getDescription());
    }

    @Override
    public void printInfo() {
        System.out.println("Футболка размера " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }
}
