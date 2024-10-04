package ru.mirea.practice.lab4.atelier;


class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеть мужчину: " + this);
    }
}

