package ru.mirea.practice.s23k0130.task9;

class Armchair extends Furniture {
    public Armchair(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Мебель: Кресло"
                + "\nМатериал: " + material
                + "\nЦвет: " + colour
                + "\nЦена: " + price);
    }
}
