package ru.mirea.practice.s0000001.task1;

interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    FunctionalChair createFunctionalChair();
}