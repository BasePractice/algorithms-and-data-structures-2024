package ru.mirea.practice.s23k0505.atelier;

public abstract class Atelier {

    public static void dressMan(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof MenClothing) {
                ((MenClothing) clothe).dressMan();
                System.out.print('\n');
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothing) {
                ((WomenClothing) clothe).dressWoman();
                System.out.print('\n');
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];

        clothes[0] = new TShirt(ClothingSizes.XXS, 1000, "Красный");
        clothes[1] = new Pants(ClothingSizes.M, 5000, "Синий");
        clothes[2] = new Skirt(ClothingSizes.L, 10000, "Чёрный");
        clothes[3] = new Tie(ClothingSizes.S, 2000, "Зелёный");

        dressMan(clothes);
        dressWoman(clothes);
    }
}
