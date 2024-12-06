package ru.mirea.practice.s23l0908.task3;

import java.util.Random;

public final class Tester { // Marking as final
    private static final int MIN_RANDOM_AVERAGE = 2;
    private static final int MAX_RANDOM_AVERAGE = 13;
    private static final double POSITION_RANGE = 20.0;
    private static final double RADIUS_RANGE = 10.0;
    private static final int CHAR_OFFSET = 97;
    private static final int CHAR_RANGE = 26;

    // Private constructor to prevent instantiation (utility class)
    private Tester() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(String[] args) {
        Random random = new Random();
        int average = random.nextInt(MAX_RANDOM_AVERAGE) + MIN_RANDOM_AVERAGE;
        Circle[] balls = new Circle[average];
        for (int i = 0; i < average; ++i) {
            balls[i] = new Circle(
                random.nextDouble() * POSITION_RANGE - POSITION_RANGE / 2,
                random.nextDouble() * POSITION_RANGE - POSITION_RANGE / 2,
                random.nextDouble() * RADIUS_RANGE,
                (char) (random.nextInt(CHAR_RANGE) + CHAR_OFFSET)
            );
            System.out.println(balls[i].toString());
        }
    }
}





