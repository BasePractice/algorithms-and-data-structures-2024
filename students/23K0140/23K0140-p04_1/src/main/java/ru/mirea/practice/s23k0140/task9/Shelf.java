package ru.mirea.practice.s23k0140.task9;

class Shelf extends Furniture {
    public Shelf(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Позиция - Полка" + "\nМатериал: " + material + "\nЦвет: " + colour + "\nЦена: " + price);
    }
}