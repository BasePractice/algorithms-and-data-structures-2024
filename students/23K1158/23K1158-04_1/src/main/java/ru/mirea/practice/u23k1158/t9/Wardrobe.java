package ru.mirea.practice.u23k1158.t9;

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