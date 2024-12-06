package ru.mirea.practice.s23l0908.task2;

class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Dress men in the tie sized " + getSize());
    }
}
