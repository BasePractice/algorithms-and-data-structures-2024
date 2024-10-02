package ru.mirea.practice.s0000001;

class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в галстук.");
    }
}