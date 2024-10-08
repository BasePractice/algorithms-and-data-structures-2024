package ru.mirea.practice.s23K0135;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в юбку.");
    }
}
