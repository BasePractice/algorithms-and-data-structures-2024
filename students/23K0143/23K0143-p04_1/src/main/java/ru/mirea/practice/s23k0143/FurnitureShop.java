package ru.mirea.practice.s23k0143;

import java.util.ArrayList;

class FurnitureShop extends ArrayList<Furniture> {

    public void addFurniture(Furniture furniture) {
        this.add(furniture);
    }

    public void showAllFurniture() {
        for (Furniture furniture : this) {
            furniture.displayInfo();
        }
    }
}
