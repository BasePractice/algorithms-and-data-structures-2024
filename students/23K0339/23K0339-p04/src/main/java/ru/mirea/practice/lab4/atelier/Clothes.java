package ru.mirea.practice.lab4.atelier;

abstract class Clothes {
    private final Size size;
    private final double cost;
    private final String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Размер: " + size + ", Цена: " + cost + " руб., Цвет: " + color;
    }
}


