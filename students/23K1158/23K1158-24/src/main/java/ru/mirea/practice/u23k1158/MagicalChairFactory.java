package ru.mirea.practice.u23k1158;

public class MagicalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
