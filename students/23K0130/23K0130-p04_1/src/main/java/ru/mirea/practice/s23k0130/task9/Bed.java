package ru.mirea.practice.s23k0130.task9;

class Bed extends Furniture {
    public Bed(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Мебель: Кровать"
                + "\nМатериал: " + material
                + "\nЦвет: " + colour
                + "\nЦена: " + price);
    }
}