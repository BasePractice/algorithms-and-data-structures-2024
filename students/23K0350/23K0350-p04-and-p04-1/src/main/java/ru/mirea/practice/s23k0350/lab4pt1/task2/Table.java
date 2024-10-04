package ru.mirea.practice.s23k0350.lab4pt1.task2;

class Table extends Furniture {
    private double length;
    private double width;

    public Table(String name, String material, double price, double length, double width) {
        super(name, material, price);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String getType() {
        return "Стол";
    }
}
