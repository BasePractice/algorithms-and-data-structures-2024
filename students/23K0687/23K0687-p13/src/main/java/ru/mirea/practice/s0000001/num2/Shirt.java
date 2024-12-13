package ru.mirea.practice.s0000001.num2;

public class Shirt {
    String id;
    String name;
    String color;
    String size;

    public Shirt(String str) {
        String[] p = str.split(",");
        this.id = p[0];
        this.name = p[1];
        this.color = p[2];
        this.size = p[3];
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nНазвание: " + name + "\nЦвет: " + color + "\nРазмер: " + size;
    }
}
