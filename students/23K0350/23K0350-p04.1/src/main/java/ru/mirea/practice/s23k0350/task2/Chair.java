package ru.mirea.practice.s23k0350.task2;

class Chair extends Furniture {
    public Chair(String name, String material, double price) {
        super(name, material, price);
    }

    @Override
    public String getType() {
        return "Стул";
    }
}
