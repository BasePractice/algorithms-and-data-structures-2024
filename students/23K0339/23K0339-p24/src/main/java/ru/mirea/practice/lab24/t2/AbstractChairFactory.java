package ru.mirea.practice.lab24.t2;

public interface AbstractChairFactory {
    Chair createVictorianChair(int age);

    Chair createMultifunctionalChair();

    Chair createMagicalChair();
}

