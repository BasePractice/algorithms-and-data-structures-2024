package ru.mirea.practice.s0000001.atelie;

public abstract class AtelierUtils {
    public static void dressWomen(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public static void dressMan(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }
}
