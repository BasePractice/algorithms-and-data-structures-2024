package ru.mirea.practice.s23k0690;

class VictorianChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
