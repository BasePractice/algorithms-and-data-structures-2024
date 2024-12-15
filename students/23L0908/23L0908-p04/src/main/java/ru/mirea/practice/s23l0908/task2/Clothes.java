package ru.mirea.practice.s23l0908.task2;

abstract class Clothes {
    private final ClothingSize size;
    private final double cost;
    private final String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    @SuppressWarnings("unused")
    public double getCost() {
        return cost;
    }

    @SuppressWarnings("unused")
    public String getColor() {
        return color;
    }
}
