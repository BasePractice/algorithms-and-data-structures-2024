package ru.mirea.practice.s0000001;

public class Atelier {

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

    public static void main(String[] args) {
        Clothes[] clothesArray = {
            new TShirt(Size.M, 25.99, "красный"),
            new Pants(Size.L, 45.99, "синий"),
            new Skirt(Size.S, 29.99, "черный"),
            new Tie(Size.M, 15.99, "зеленый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothesArray);
        atelier.dressMan(clothesArray);
    }
}
