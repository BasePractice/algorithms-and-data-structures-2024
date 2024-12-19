package ru.mirea.practice.s0000001.task2;

public class AbstractChairFactory {
    public Chair createMagicChair() {
        return new VagicChair();
    }

    public Chair createFunctionalChair() {
        return new MultiFuncChair();
    }

    public Chair createVictorianChair(int age) {
        return new VictorinaChair(age);
    }
}
