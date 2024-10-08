package ru.mirea.practice.s23K0135.practice41.abstractclass.furniture;

class Sofa extends Furniture {
    public String podloc;

    public Sofa(String name, String color, int price, String podloc) {
        super(name, color, price);
        this.podloc = podloc;
    }
}
