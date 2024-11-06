package ru.mirea.practice.s0000001.task1;

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof WomenClothing) {
                ((WomenClothing) cloth).dressWomen();
            }
        }
    }

    public void dressMen(Clothes[] clothes) {
        for (Clothes cloth : clothes) {
            if (cloth instanceof MenClothing) {
                ((MenClothing) cloth).dressMan();
            }
        }
    }
}
