package ru.mirea.practice.s23k0114.lab1;


public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает галстук. " + this);
    }
}
