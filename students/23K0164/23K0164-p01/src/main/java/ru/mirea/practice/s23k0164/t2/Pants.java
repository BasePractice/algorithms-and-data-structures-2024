package ru.mirea.practice.s23k0164.t2;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(SizeClothers.ListSize size, Double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем штаны для мужчин.");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем штаны для женщин.");
    }
    @Override
    public String toString() {
        return "Pants{" + super.toString() + "}";
    }
}
