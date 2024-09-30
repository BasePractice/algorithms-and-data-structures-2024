package ru.mirea.practice.s23k0362.practice41.abstractclass.furniture;

class Bedsidetable extends Furniture {
    public String light;

    public Bedsidetable(String name, String color, int price, String light) {
        super(name, color, price);
        this.light = light;
    }
}
