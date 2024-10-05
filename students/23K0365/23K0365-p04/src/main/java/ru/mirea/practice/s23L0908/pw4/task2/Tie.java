package ru.mirea.practice.s23L0908.pw4.task2;

public class Tie extends Clothes implements MenClothing {
    public void dressMen(Clothes[] arr) {
        System.out.println("Man gonna wear "
                + getColor() + " Skirt(" + getSize()
                + " euro size. " + getSize().getDescription() + "). It would cost "
                + getPrice());
    }

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }
}
