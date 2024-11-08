package ru.mirea.practice.s23k0120.task4;

import java.util.ArrayList;
import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arr.add(random.nextInt(1000));
        }

        MinMax<Integer> integerMinMax = new MinMax<Integer>(arr);
        System.out.println(integerMinMax.min());
        System.out.println(integerMinMax.max());
    }
}
