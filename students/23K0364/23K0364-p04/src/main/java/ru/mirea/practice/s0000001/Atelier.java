package ru.mirea.practice.s0000001;

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Информация о женской одежде:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Информация о мужской одежде:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }
}
