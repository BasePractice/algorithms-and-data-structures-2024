package ru.mirea.practice.s0000001.task9;

import java.util.ArrayList;
import java.util.List;

public class Furnitureshop {
    private List<Furniture> furnitureList;

    public Furnitureshop() {
        furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void showAllFurniture() {
        System.out.println("Мебель в магазине:");
        for (Furniture furniture : furnitureList) {
            System.out.println(furniture);
            System.out.println(furniture.getDescription());
        }
    }
}
