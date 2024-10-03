package ru.mirea.practice.s0000002.task3;

public class Table extends Furniture {
    private String material;

    public Table(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public String getDescription() {
        return "This is a " + material + " table named " + name;
    }
}

