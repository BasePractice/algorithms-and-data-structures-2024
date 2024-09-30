package ru.mirea.practice.s23k0362.task23;

import java.util.Scanner;

public abstract class FroMdouble {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.nextLine();
            System.out.println();
            Double a = Double.valueOf(n);

            System.out.println("int: " + a.intValue());
            System.out.println("float: " + a.floatValue());
            System.out.println("double: " + a.doubleValue());
            System.out.println("byte: " + a.byteValue());
            System.out.println("long: " + a.longValue());
            System.out.println("byte: " + a.byteValue());
        }
    }
}