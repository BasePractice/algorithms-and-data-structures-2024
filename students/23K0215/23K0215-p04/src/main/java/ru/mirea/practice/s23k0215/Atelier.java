package ru.mirea.practice.s23k0215;

public final class Atelier {

    private Atelier() {
    }

    public static void dressMan(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWoman();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes =
        {
            new TShirt(Size.M, 19.99, "синий"),
            new Pants(Size.L, 29.99, "черный"),
            new Skirt(Size.S, 24.99, "красный"),
            new Tie(Size.M, 9.99, "зеленый")
        };

        System.out.println("Одежда для мужчин:");
        dressMan(clothes);

        System.out.println("\nОдежда для женщин:");
        dressWoman(clothes);
    }
}