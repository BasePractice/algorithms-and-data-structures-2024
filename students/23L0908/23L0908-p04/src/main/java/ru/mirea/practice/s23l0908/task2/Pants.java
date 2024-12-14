package ru.mirea.practice.s23l0908.task2;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Dress men in the pants sized " + getSize());
    }

    @Override
    public void dressWomen() {
        System.out.println("Dress women in the pants sized " + getSize());
    }
}
