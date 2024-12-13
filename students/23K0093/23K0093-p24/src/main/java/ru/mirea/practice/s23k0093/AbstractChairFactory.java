package ru.mirea.practice.s23k0093;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    FunctinalChair createFunctinalChair();
}
