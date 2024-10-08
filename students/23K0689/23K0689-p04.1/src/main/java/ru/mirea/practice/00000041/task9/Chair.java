package ru.mirea.practice.s23K0135.task9;

public class Chair extends Furniture {

    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public String getDescription() {
        return "Это стул. Идеален для сидения.";
    }
}
