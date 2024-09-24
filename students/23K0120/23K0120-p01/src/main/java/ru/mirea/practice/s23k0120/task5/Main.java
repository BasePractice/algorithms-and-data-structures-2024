package ru.mirea.practice.s23k0120.task5;

import java.util.Arrays;

public abstract class Main {
    public static void main(String[] args) {
        for (String arg: args) {
            System.out.printf(arg);
        }
        System.out.println(Arrays.toString(args));
    }
}
