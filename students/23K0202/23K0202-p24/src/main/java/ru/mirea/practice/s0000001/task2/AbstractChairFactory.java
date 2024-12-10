package ru.mirea.practice.s0000001.task2;

public interface AbstractChairFactory {
    Chair createVictorianChair(int age);

    Chair createFunctionalChair();

    Chair createMagicChair();
}
