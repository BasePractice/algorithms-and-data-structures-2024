package ru.mirea.practice.s23k0114.lab1;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает штаны. " + this);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одевает штаны. " + this);
    }
}