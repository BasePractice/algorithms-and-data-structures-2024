package ru.mirea.practice.s29k0112.task2;

public interface AbstractChairFactory {
    Chair createVictorianChair(int age);

    Chair createFunctionalChair();

    Chair createMagicChair();
}
