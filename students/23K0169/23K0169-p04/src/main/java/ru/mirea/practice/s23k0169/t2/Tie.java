package ru.mirea.practice.s23k0169.t2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть мужчину в галстук: " + getInfo());
    }

    @Override
    public String getInfo() {
        return "Галстук, размер: " + size + ", цена: " + price + ", цвет: " + color;
    }
}

