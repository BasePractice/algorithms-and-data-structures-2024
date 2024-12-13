package ru.mirea.practice.s29k0112.task2;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public Chair createFunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public Chair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public Chair createVictorianChair(int age) {
        return new VictorianChair(age);
    }
}
