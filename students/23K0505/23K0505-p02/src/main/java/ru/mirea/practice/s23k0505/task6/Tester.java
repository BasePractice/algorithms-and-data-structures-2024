package ru.mirea.practice.s23k0505.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Tester {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Circle> circles = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            circles.add(new Circle(rand.nextDouble() * 10 - 10,
                    rand.nextDouble() * 10 - 10,
                    rand.nextDouble() * 10));
            System.out.println(circles.get(i));
        }

        double diff = circles.get(0).compareWithCircle(circles.get(1));
        if (diff == 0) {
            System.out.println("Радиус окружностей одинковый");
        } else if (diff > 0) {
            System.out.printf("Радиус первой окружности больше радиуса второй на %.2f", diff);
        } else {
            System.out.printf("Радиус второй окружности больше радиуса первой на %.2f", -diff);
        }
    }
}

