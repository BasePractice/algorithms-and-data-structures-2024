package ru.mirea.practice.s0000001;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: размер " + getSize() + ", цвет " + getColor() + ", цена " + getPrice());
    }
}
