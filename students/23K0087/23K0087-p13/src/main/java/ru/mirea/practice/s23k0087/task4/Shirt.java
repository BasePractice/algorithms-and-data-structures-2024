package ru.mirea.practice.s23k0087.task4;

public class Shirt {
    String index;
    String name;
    String color;
    String size;

    public Shirt(String index, String name, String color, String size) {
        this.index = index;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt [index=" + index + ", name=" + name + ", color=" + color + ", size=" + size + "]";
    }
}
