package ru.mirea.practice.s23K0135;

import java.util.Arrays;

public abstract class Pr5 {
    public static void main(String[] args) {
        for (String a : args) {
            System.out.println(a);
        }
        System.out.println(Arrays.toString(args));
    }
}
