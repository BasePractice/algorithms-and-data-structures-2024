package ru.mirea.practice.s23k0350.lab4.task2.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в юбку размера " + size.getDescription());
    }

    @Override
    public void printInfo() {
        System.out.println("Юбка размера " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }
}
