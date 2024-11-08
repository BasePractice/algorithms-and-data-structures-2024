package ru.mirea.practice.s23k0755.task4;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String stringData) {
        String[] data = stringData.split(",");
        this.id = data[0];
        this.name = data[1];
        this.color = data[2];
        this.size = data[3];
    }

    public Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("\n\nID number: %s \nName: %s\nColor: %s\nSize: %s", id, name, color, size);
    }
}
