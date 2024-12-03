package ru.mirea.practice.s0000001;

abstract class Shirt {
    protected String id;
    protected String name;
    protected String color;
    protected String size;

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Color: " + color + "\n"
                + "Size: " + size + "\n";
    }
}
