package ru.mirea.practice.s0000001.task2;

public class VictorFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new Victor(0);
    }
}
