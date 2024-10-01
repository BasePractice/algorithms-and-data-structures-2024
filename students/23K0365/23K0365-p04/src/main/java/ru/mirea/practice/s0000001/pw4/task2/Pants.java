package ru.mirea.practice.s0000001.pw4.task2;

public class Pants extends Clothes implements WomenClothing, MenClothing {
    public void dressMen(Clothes[] arr) {
        System.out.println("Man gonna wear "
                + getColor() + " Pants(" + getSize()
                + " euro size. " + getSize().getDescription() + "). It would cost "
                + getPrice());
    }

    public void dressWomen(Clothes[] arr) {
        System.out.println("Woman gonna wear "
                + getColor() + " Pants(" + getSize()
                + " euro size. " + getSize().getDescription() + "). It would cost "
                + getPrice());
    }

    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }
}