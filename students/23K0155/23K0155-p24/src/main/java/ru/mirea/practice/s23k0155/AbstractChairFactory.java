package ru.mirea.practice.s23k0155;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    FunctinalChair createFunctinalChair();
}
