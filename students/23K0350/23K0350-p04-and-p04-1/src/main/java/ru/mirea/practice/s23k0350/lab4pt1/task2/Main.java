package ru.mirea.practice.s23k0350.lab4pt1.task2;

public abstract class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);
        shop.addFurniture(new Chair("Классический стул", "Дерево", 100.0));
        shop.addFurniture(new Table("Помпезный стол", "Камень", 250.0, 150.0, 100.0));
        shop.addFurniture(new Sofa("Кожаный диван", "Кожа", 500.0));

        shop.printAllFurniture();
    }
}