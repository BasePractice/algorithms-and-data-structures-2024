package ru.mirea.practice.s23K0135;

class Chair extends Furniture {
    public Chair(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Позиция - Стул" + "\nМатериал: " + material + "\nЦвет: " + colour + "\nЦена: " + price);
    }
}
