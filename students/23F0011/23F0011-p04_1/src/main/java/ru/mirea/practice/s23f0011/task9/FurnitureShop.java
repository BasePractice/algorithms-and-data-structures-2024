package ru.mirea.practice.s23f0011.task9;

import java.util.ArrayList;
import java.util.List;

class FurnitureShop {
    private final List<Furniture> furnitureItems;

    public FurnitureShop() {
        furnitureItems = new ArrayList<>();
    }

    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop();

        furnitureShop.addFurniture(new Chair("Стул", "Дерево", 100));
        furnitureShop.addFurniture(new Table("Стол", "Дерево", 200, 4));
        furnitureShop.addFurniture(new Sofa("Диван", "Кожа", 500, 3));

        furnitureShop.displayAllFurniture();
    }

    public void addFurniture(Furniture furniture) {
        furnitureItems.add(furniture);
    }

    public void displayAllFurniture() {
        for (Furniture furniture : furnitureItems) {
            furniture.displayInfo();
            String result = String.format("%.1f", furniture.calculatePrice());
            System.out.println("Расчетная цена: " + result + "\n");
        }
    }
}

