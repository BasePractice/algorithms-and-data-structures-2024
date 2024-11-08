package ru.mirea.practice.s0000001;

public class Shirt {
    private String num;
    private String name;
    private String color;
    private String size;

    public Shirt(String num, String name, String color, String size) {
        this.num = num;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return "Shirt{number:" + num + ", name:" + name + ", color:" + color + ", size:" + size + "}";
    }
}
