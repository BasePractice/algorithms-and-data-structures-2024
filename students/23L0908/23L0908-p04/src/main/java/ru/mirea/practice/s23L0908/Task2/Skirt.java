package ru.mirea.practice.s23L0908.Task2;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Dress women in the skirt sized " + getSize());
    }
}
