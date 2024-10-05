package ru.mirea.practice.s23L0908;

public abstract class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
            new TShirt(Size.M, 19.99, "Синий"),
            new Pants(Size.L, 39.99, "Черный"),
            new Skirt(Size.S, 29.99, "Красный"),
            new Tie(Size.M, 15.99, "Темно-синий")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}
