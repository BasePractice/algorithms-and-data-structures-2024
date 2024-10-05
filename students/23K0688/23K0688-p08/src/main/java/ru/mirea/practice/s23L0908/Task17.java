package ru.mirea.practice.s23L0908;

import java.util.Scanner;

public abstract class Task17 {
    public static void main(String[] args) {
        maxer0(0);
    }

    public static void maxer0(int max) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("max is - " + max);
            } else {
                if (n > max) {
                    max = n;
                }
                maxer0(max);
            }
        }
    }
}
