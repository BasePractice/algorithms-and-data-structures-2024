package ru.mirea.practice.s0000001.pw4.task2;

public abstract class AtelieTest {
    public static void main(String[] args) {
        Clothes[] a = {
            new Tie(Size.L, 230, "Blue"),
            new Skirt(Size.XXS, 359, "Red"),
            new Pants(Size.M, 749, "White")
        };

        Atelie at = new Atelie();
        at.dressWomen(a);
        at.dressMen(a);
    }
}