package ru.mirea.practice.s23k0350;

import java.util.Arrays;

public abstract class Lab1Task1 {

    public static void main(String[] args) {
        int x = 1023;
        float summa = 0;
        double sredarif = 0;
        int [] baza = new int [7];
        for (int i = 0; i <= 6;i++) {
            if (i % 2 == 0) {
                x = x + 2;
                baza[i] = x - 1;
            } else {
                baza[i] = i;
            }
            summa = summa + baza [i];
            sredarif = summa / 7;
        }
        System.out.println(Arrays.toString(baza));
        System.out.println(summa);
        System.out.println(sredarif);


    }
}
