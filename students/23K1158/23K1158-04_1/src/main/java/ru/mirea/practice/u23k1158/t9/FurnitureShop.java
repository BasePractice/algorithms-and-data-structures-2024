package ru.mirea.practice.u23k1158.t9;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {

    private final List<Furniture> furnitureList;

    public FurnitureShop() {
        this.furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void presentShop() {
        for (Furniture furniture : furnitureList) {
            furniture.furniture();
            System.out.println();
        }
    }
}