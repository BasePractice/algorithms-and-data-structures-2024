package ru.mirea.practice.s23l0908.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public final class Tester {

    private Tester() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Random random = new Random();
        int average = random.nextInt(2, 8);

        List<Circle> balls = new ArrayList<>();
        for (int i = 0; i < average; i++) {
            balls.add(new Circle(random.nextDouble(-10, 10), random.nextDouble(-10, 10), random.nextDouble(0, 10), (char) random.nextInt(97, 122)));
            System.out.println(balls.get(i).toString());
        }
        sorted(balls);
        System.out.println("Sorted: ");
        for (Circle ball : balls) {
            System.out.println(ball.toString());
        }
        System.out.println("The smallest ball:  " + getMin(balls));
        System.out.println("The biggest ball:  " + getMax(balls));
    }

    public static Circle getMax(List<Circle> balls) {
        return Collections.max(balls);
    }

    public static Circle getMin(List<Circle> balls) {
        return Collections.min(balls);
    }

    public static void sorted(List<Circle> balls) {
        Collections.sort(balls);
    }
}

