package ru.mirea.practice.s23k0350.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в галстук размера " + size.getDescription());
    }

    @Override
    public void printInfo() {
        System.out.println("Галстук размера " + size.getDescription() + ", цена " + price + ", цвет " + color);
    }
}
