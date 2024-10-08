package ru.mirea.practice.s23K0135.task3;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private List<Furniture> inventory; // Изменено на List<Furniture>

    public FurnitureShop() {
        inventory = new ArrayList<>(); // Инициализируем конкретную реализацию здесь
    }

    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    public void displayInventory() {
        for (Furniture furniture : inventory) {
            System.out.println(furniture);
        }
    }

    public void buyFurniture(String name) {
        // Логика для покупки мебели
    }
}
