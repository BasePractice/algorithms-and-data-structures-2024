package ru.mirea.practice.s23k0155.task4;

class Shirt {
    String id;
    String name;
    String color;
    String size;

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
