package ru.mirea.practice.s23k0145.lab41;

public abstract class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Armchair armchair = new Armchair("Металл", "Белый", 5000);
        Wardrobe wardrobe = new Wardrobe("МДФ", "Черный", 15000);
        Bed bed = new Bed("ДСП", "Синий", 30000);

        shop.addFurniture(armchair);
        shop.addFurniture(wardrobe);
        shop.addFurniture(bed);

        shop.presentShop();
    }
}
