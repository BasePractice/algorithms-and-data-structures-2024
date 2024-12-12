package ru.mirea.practice.lab24.t2;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public Chair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public Chair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }

    @Override
    public Chair createMagicalChair() {
        return new MagicalChair();
    }
}


