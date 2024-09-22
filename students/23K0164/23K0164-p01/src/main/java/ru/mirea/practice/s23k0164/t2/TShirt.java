package ru.mirea.practice.s23k0164.t2;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(SizeClothers.ListSize size, Double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем футболку для мужчин.");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем футболку для женщин.");
    }

    @Override
    public String toString() {
        return "TShirt{" + super.toString() + "}";
    }
}

