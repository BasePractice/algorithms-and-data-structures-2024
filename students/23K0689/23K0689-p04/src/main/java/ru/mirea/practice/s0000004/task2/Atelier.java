package ru.mirea.practice.s0000004.task2;

public class Atelier {

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWoman();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
            new TShirt(ClothesSize.M, 19.99, "Красный"),
            new Pants(ClothesSize.L, 49.99, "Синий"),
            new Skirt(ClothesSize.S, 29.99, "Чёрный"),
            new Tie(ClothesSize.XS, 14.99, "Зелёный")
        };

        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWoman(clothes);
    }
}