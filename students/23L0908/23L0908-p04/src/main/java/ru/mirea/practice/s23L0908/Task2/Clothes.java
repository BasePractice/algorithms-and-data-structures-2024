package ru.mirea.practice.s23L0908.Task2;

abstract class Clothes {
    private ClothingSize size;
    private double cost;
    private String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
