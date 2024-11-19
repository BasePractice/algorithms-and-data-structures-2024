package ru.mirea.practice.s23k0143;

public class MagicalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
