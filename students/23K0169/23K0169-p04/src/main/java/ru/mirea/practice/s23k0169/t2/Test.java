package ru.mirea.practice.s23k0169.t2;

public final class Test {

    private Test() {

    }

    public static void main(String[] args) {
        Clothes[] clothes = {new TShirt(Size.M, 19.99, "Красный"), new Pants(Size.L, 39.99, "Синий"),
            new Skirt(Size.S, 29.99, "Черный"), new Tie(Size.M, 15.99, "Зеленый")};

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}