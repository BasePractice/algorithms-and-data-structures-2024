package ru.mirea.practice.lab4.atelier;

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть мужчину: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть женщину: " + this);
    }
}


