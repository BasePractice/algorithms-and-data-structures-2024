package ru.mirea.practice.s23l0908.task2;

@SuppressWarnings("unused")
class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Dress women in the skirt sized " + getSize());
    }
}
