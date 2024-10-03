package ru.mirea.practice.s0000002;

import java.util.Random;

public abstract class First {
    public static void main(String[] args) {
        Random rand = new Random();
        float[] m = new float[10];
        for (int i = 0; i < 10;i++) {
            m[i] = rand.nextFloat();
            System.out.println(m[i]);
        }
        float b;
        int f;
        System.out.println(" ");
        for (int i = 0;i < 10;i++) {
            f = 0;
            for (int j = 0;j < 10 - i - 1;j++) {
                if (m[j] > m[j + 1]) {
                    b = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = b;
                    f = 1;
                }
            }
            if (f == 0) {
                break;
            }
        }
        for (int i = 0;i < 10;i++) {
            System.out.println(m[i]);
        }
    }
}