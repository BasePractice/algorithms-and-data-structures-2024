package ru.mirea.practice.s230k754.lab11.task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);

    MagicChair createMagicanChair();

    FunctionalChair createFunctionalChair();
}
