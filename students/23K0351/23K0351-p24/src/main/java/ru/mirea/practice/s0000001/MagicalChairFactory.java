package ru.mirea.practice.s0000001;

public class MagicalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}