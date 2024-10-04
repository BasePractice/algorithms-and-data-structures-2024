package ru.mirea.practice.s0000001.n2;

public abstract class Atelier {
    public static void dressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {
            new TShirt(Size.M, 500, "Красный"),
            new Pants(Size.L, 1000, "Черный"),
            new Skirt(Size.S, 700, "Синий"),
            new Tie(Size.M, 300, "Зеленый")
        };

        dressMan(clothes);
        dressWomen(clothes);
    }
}