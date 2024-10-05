package ru.mirea.practice.s23L0908.task21;

import java.util.Scanner;

public abstract class Doubl {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.nextLine();
            System.out.println();
            Double a = Double.valueOf(n);
            System.out.println(a);
        }
    }
}
