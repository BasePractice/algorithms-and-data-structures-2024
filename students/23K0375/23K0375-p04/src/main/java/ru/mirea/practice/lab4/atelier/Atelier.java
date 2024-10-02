package ru.mirea.practice.lab4.atelier;


class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }
}

