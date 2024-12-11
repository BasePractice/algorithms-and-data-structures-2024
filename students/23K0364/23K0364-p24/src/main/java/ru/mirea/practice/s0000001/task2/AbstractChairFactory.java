package ru.mirea.practice.s0000001.task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);

    MagicChair createMagicanChair();

    FunctionalChair createFunctionalChair();
}
