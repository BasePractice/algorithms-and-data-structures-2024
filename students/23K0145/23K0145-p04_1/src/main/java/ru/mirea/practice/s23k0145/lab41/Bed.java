package ru.mirea.practice.s23k0145.lab41;

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
