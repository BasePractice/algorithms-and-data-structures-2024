package ru.mirea.practice.s23k0114.lab1;

interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    FunctionalChair createFunctionalChair();
}
