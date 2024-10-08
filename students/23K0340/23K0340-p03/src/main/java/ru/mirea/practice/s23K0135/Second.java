package ru.mirea.practice.s23K0135;

import java.util.Random;

public abstract class Second {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] m = new int[4];
        int f = 0;
        for (int i = 0;i < 4;i++) {
            m[i] = rand.nextInt(90) + 10;
            System.out.print(m[i] + " ");
            if (i > 0) {
                if (m[i] < m[i - 1]) {
                    f = 1;
                }
            }
        }
        if (f == 0) {
            System.out.println("Массив строго возрастает");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
