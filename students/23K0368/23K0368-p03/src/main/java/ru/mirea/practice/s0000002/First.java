package ru.mirea.practice.s0000002;

import java.util.Arrays;
import java.util.Random;

public abstract class First {
    public static void main(String[] args) {
        Float[] array1 = new Float[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array1[i] = random.nextFloat();
        }
        System.out.println("1 Массив, созданный с помощью класса Random(): ");
        System.out.println(Arrays.toString(array1));
        array1 = Arrays.stream(array1).sorted().toArray(Float[]::new);
        System.out.println(Arrays.toString(array1));

        System.out.println();
        Float[] array2 = new Float[10];

        for (int i = 0; i < 10; i++) {
            array2[i] = (float) Math.random();
        }
        System.out.println("2 Массив, созданный с помощью метода random(): ");
        System.out.println(Arrays.toString(array2));
        array2 = Arrays.stream(array2).sorted().toArray(Float[]::new);
        System.out.println(Arrays.toString(array2));
    }
}
