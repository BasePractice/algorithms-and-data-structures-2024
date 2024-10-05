package ru.mirea.practice.s23L0908.n2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук, размер: " + size + ", цена: " + price + ", цвет: " + color);
    }
}
