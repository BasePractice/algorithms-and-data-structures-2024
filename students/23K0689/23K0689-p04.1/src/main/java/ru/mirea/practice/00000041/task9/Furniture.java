package ru.mirea.practice.s0000001.task9;

// Абстрактный класс Мебель
public abstract class Furniture {
    private String name;
    private double price;

    // Конструктор абстрактного класса
    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Переопределение метода toString для вывода информации о мебели
    @Override
    public String toString() {
        return "Название: " + name + ", Цена: " + price + " руб.";
    }
}