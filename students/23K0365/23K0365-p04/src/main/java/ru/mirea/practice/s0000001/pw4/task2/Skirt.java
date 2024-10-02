package ru.mirea.practice.s0000001.pw4.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    public void dressWomen(Clothes[] arr) {
        System.out.println("Woman gonna wear "
                + getColor() + " Skirt(" + getSize()
                + " euro size. " + getSize().getDescription() + "). It would cost "
                + getPrice());
    }
}