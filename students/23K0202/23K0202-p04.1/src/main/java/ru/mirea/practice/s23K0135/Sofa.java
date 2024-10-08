package ru.mirea.practice.s23K0135;

class Sofa extends Furniture {
    public Sofa(String material, String color, double price) {
        super(material, color, price);
    }

    public void furniture() {
        System.out.println("Позиция - Диван" + "\nМатериал: " + material + "\nЦвет: " + colour + "\nЦена: " + price);
    }
}
