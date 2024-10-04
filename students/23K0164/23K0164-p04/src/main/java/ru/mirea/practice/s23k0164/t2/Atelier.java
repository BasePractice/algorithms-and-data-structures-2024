package ru.mirea.practice.s23k0164.t2;

public class Atelier {
    private Clothes[] clothingArray;

    public Atelier(Clothes[] clothingArray) {
        this.clothingArray = clothingArray;
    }

    public void dressWomen() {
        System.out.println("Женская одежда:");
        for (Clothes item : clothingArray) {
            if (item instanceof WomenClothing) {
                System.out.println(item);
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan() {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothingArray) {
            if (item instanceof MenClothing) {
                System.out.println(item);
                ((MenClothing) item).dressMan();
            }
        }
    }
}
