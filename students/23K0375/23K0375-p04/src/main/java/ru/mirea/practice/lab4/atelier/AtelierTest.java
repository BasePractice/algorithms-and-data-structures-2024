package ru.mirea.practice.lab4.atelier;

public abstract class AtelierTest {
    public static void main(String[] args) {
        Clothes[] clothesArray = {
            new TShirt(Size.M, 500, "Синий"),
            new Pants(Size.L, 1200, "Черный"),
            new Skirt(Size.S, 800, "Красный"),
            new Tie(Size.M, 300, "Зеленый")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothesArray);
        atelier.dressMan(clothesArray);
    }
}