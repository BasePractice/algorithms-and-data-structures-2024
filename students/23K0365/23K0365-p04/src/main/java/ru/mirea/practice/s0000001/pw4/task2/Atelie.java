package ru.mirea.practice.s0000001.pw4.task2;

public class Atelie implements WomenClothing, MenClothing {
    @Override
    public void dressWomen(Clothes[] arr) {
        for (Clothes x: arr) {
            if (x instanceof WomenClothing) {
                ((WomenClothing) x).dressWomen(arr);
            }
        }
    }

    public void dressMen(Clothes[] arr) {
        for (Clothes x: arr) {
            if (x instanceof MenClothing) {
                ((MenClothing) x).MenClothing(arr);
            }
        }
    }
}