package ru.mirea.practice.s0000001.task1;

public class Item {
    private String name;
    private int id;

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
