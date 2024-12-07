package ru.mirea.practice.s00000024.task2;

public class ConcreteChairFactory implements ChairFactory {
    @Override
    public Chair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public Chair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }

    @Override
    public Chair createMagicChair() {
        return new MagicChair();
    }
}

