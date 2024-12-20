package ru.mirea.practice.s0000001;

public interface ChairFactory {

    VictorianChair createVictorianChair(int age);

    MultifunctionalChair createMultifunctionalChair();

    MagicChair createMagicChair();
}
