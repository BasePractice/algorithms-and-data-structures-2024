package ru.mirea.practice.u23k1158.t9;

public abstract class Main {

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        shop.addFurniture(new Armchair("Металл", "Белый", 6990));
        shop.addFurniture(new Wardrobe("ДСП", "Черный", 14990));
        shop.addFurniture(new Bed("Дуб", "Синий", 25990));

        shop.presentShop();
    }
}