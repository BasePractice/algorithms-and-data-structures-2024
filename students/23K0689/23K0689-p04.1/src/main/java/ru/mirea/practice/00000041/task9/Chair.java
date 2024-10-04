package ru.mirea.practice.s0000001.task9;

public class Chair extends Furniture {

    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Это стул. Идеален для сидения.";
    }
}
