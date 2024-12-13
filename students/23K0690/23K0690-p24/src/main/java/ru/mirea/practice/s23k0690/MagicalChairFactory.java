package ru.mirea.practice.s23k0690;

class MagicalChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new MagicalChair();
    }
}
