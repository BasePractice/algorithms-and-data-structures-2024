package ru.mirea.practice.s0000001.pw4.task2;

public class TShirt extends Clothes implements WomenClothing, MenClothing {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    public void dressMen(Clothes[] arr) {
        System.out.println("Man gonna wear "
                + getColor() + " Skirt(" + getSize()
                + " euro size. " + getSize().getDescription() + "). It would cost "
                + getPrice());
    }

    public void dressWomen(Clothes[] arr) {
        System.out.println("Woman gonna wear "
                + getColor() + " T-Shirt(" + getSize()
                + " euro size. " + getSize().getDescription() + "). It would cost "
                + getPrice());
    }


}