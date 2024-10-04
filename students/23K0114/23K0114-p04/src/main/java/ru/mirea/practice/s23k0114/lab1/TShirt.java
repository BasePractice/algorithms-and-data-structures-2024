package ru.mirea.practice.s23k0114.lab1;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает футболку. " + this);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одевает футболку. " + this);
    }
}