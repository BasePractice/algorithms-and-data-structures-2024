package ru.mirea.practice.s23k0130.task9;

class Wardrobe extends Furniture {
    public Wardrobe(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Мебель: Шкаф"
                + "\nМатериал: " + material
                + "\nЦвет: " + colour
                + "\nЦена: " + price);
    }
}