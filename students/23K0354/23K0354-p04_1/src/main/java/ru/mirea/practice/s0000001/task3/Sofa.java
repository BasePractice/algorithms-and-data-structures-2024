package ru.mirea.practice.s0000001.task3;

public class Sofa extends Furniture {
    private int seatingCapacity;

    public Sofa(String name, double price, int seatingCapacity) {
        super(name, price);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String getDescription() {
        return "This is a sofa named " + name + " with a seating capacity of " + seatingCapacity + " people.";
    }
}


