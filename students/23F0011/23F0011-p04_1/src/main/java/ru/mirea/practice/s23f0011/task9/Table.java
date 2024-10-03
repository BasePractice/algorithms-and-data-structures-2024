package ru.mirea.practice.s23f0011.task9;

class Table extends Furniture {
    private final int legs;

    public Table(String name, String material, double price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }

    public double calculatePrice() {
        return price + (legs * 5); // Дополнительная цена за каждую ножку
    }

    public int getLegs() {
        return legs;
    }
}