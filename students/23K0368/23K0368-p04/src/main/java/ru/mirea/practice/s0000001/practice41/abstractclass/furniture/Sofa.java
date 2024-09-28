package ru.mirea.practice.s0000001.practice41.abstractclass.furniture;

class Sofa extends Furniture {
    public String podloc;

    public Sofa(String name, String color, int price, String podloc) {
        super(name, color, price);
        this.podloc = podloc;
    }
}
