package ru.mirea.practice.s23L0908;

class Table extends Furniture {
    public Table(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Позиция - Стол" + "\nМатериал: " + material + "\nЦвет: " + colour + "\nЦена: " + price);
    }
}
