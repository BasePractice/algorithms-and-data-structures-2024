package ru.mirea.practice.s23k0120.task2;

public class ChairFactory extends AbstractChairFactory {

    @Override
    VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
