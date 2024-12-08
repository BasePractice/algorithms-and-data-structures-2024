package ru.mirea.practice.s23k0368.prog2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);

    MagicChair createMagicChair();

    FunctionalChair createFunctionalChair();
}
