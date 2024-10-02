package ru.mirea.practice.s0000001.atelie;

public abstract class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {new TShirt(Size.M, 20.0, "White"), new Pants(Size.L, 30.0, "Blue"),
                             new Skirt(Size.S, 25.0, "Red"), new Tie(Size.XS, 15.0, "Black"),
                             new TShirt(Size.XS, 18.0, "Pink")};

        AtelierUtils.dressWomen(clothes);
        AtelierUtils.dressMan(clothes);
    }
}