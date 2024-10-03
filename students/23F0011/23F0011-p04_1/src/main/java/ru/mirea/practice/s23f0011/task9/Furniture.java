package ru.mirea.practice.s23f0011.task9;

abstract class Furniture {
    protected String name;
    protected String material;
    protected double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public abstract double calculatePrice();

    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Материал: " + material);
        System.out.println("Цена: " + price);
    }
}
