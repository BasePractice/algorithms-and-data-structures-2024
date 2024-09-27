package ru.mirea.practice.s0000001;

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
