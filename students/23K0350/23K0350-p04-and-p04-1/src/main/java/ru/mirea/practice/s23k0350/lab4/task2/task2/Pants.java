package ru.mirea.practice.s23k0350.lab4.task2.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в штаны размера " + size.getDescription());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в штаны размера " + size.getDescription());
    }

    @Override
    public void printInfo() {
        System.out.println("Штаны размера " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }
}
