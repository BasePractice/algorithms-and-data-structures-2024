package ru.mirea.practice.s23f0011.task2;

public class ConcreteChairFactory implements ChairFactory {

    public Chair createVictorianChair() {
        return new VictorianChair();
    }

    public Chair createFunctionalChair() {
        return new FunctionalChair();
    }

    public Chair createMagicanChair() {
        return new MagicanChair();
    }
}
