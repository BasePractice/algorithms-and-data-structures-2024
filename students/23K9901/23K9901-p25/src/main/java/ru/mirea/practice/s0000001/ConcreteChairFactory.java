package ru.mirea.practice.s0000001;

public class ConcreteChairFactory implements ChairFactory {
    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MultifunctionalChair createMultifunctionalChair() {
        return new MultifunctionalChair();
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }
}
