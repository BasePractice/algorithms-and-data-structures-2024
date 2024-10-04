package ru.mirea.practice.s23f0011.task9;

class Chair extends Furniture {
    public Chair(String name, String material, double price) {
        super(name, material, price);
    }

    public double calculatePrice() {
        return price * 1.1; // Дополнительная наценка 10% на стулья
    }
}