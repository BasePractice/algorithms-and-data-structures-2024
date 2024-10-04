package ru.mirea.practice.s0000006.task6789;

public class Shop implements Printable {
    private String name;
    private String location;

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void print() {
        System.out.println("Shop: " + name + " located at " + location);
    }
}