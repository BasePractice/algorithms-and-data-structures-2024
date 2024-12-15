package ru.mirea.practice.s23k0350;


class VictorianChairFactory extends ChairFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
