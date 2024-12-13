package ru.mirea.practice.s23k0350;


class MultifunctionalChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
