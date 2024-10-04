package ru.mirea.practice.s0000001.prog3;

public class Cars implements Nameable {
    String name;
    String color;

    Cars(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cars{"
                + "name='" + name + '\''
                + ", color='" + color + '\''
                + '}';
    }
}
