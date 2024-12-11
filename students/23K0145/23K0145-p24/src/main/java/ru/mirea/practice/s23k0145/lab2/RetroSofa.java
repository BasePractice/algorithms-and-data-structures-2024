package ru.mirea.practice.s23k0145.lab2;

public class RetroSofa implements Furniture {
    private final int durability;

    public RetroSofa(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }
}
