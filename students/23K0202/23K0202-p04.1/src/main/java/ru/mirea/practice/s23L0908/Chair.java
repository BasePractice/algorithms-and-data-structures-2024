package ru.mirea.practice.s23L0908;

class Chair extends Furniture {
    public Chair(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Позиция - Стул" + "\nМатериал: " + material + "\nЦвет: " + colour + "\nЦена: " + price);
    }
}
