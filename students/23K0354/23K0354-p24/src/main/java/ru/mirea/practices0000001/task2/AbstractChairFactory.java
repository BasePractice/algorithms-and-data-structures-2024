package ru.mirea.practices0000001.task2;

public abstract class AbstractChairFactory {
    abstract VictorianChair createVictorianChair(int age);

    abstract MagicChair createMagicChair();

    abstract FunctionalChair createFunctionalChair();
}