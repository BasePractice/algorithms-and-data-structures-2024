package ru.mirea.practice.s23k0164.t2;

class Tie extends Clothes implements MenClothing {

    public Tie(SizeClothers.ListSize size, Double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем галстук для мужчин.");
    }

    @Override
    public String toString() {
        return "Tie{" + super.toString() + "}";
    }
}