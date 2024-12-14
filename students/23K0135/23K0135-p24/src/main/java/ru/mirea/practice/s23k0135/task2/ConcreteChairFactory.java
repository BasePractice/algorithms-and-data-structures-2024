package ru.mirea.practice.s23k0135.task2;

public class ConcreteChairFactory implements ChairFactory {

    public Chair createVictorianChair() {
        return new VictorianChair();
    }

    public Chair createFunctionalChair() {
        return new FunctionalChair();
    }

    public Chair createMagicalChair() {
        return new MagicalChair();
    }
}
