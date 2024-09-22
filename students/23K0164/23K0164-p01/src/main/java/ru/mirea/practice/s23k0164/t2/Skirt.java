package ru.mirea.practice.s23k0164.t2;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(SizeClothers.ListSize size, Double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем юбку для женщин.");
    }
    @Override
    public String toString() {
        return "Skirt{" + super.toString() + "}";
    }
}

