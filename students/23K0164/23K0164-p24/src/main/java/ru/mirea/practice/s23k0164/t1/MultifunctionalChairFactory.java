package ru.mirea.practice.s23k0164.t1;

public class MultifunctionalChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
