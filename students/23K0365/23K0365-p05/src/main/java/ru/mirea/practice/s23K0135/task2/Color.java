package ru.mirea.practice.s23K0135.task2;

import java.util.Random;

public enum Color {
    BLUE,
    GREEN,
    RED,
    ORANGE,
    YELLOW;

    private static final Random PRNG = new Random();

    public static Color randomOne()  {
        Color[] directions = values();
        return directions[PRNG.nextInt(directions.length)];
    }

}
