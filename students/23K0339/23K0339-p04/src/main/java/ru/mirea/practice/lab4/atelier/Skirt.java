package ru.mirea.practice.lab4.atelier;


class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть женщину: " + this);
    }
}

