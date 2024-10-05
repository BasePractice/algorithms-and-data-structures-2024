package ru.mirea.practice.s23L0908;

import java.util.Arrays;

public abstract class Program5 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println(Arrays.toString(args));
    }
}
