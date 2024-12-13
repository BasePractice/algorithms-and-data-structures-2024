package ru.mirea.practice.s23k0690;

class MultifunctionalChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new MultifunctionalChair();
    }
}
