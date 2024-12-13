package ru.mirea.practice.s23k0350;


class MagicalChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
