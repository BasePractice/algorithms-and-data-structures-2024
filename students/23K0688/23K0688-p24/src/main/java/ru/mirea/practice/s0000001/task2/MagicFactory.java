package ru.mirea.practice.s0000001.task2;

public class MagicFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new Magic();
    }
}
