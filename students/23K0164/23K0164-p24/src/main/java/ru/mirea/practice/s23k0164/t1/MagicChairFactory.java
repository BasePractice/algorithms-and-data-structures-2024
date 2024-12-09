package ru.mirea.practice.s23k0164.t1;

public class MagicChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}
