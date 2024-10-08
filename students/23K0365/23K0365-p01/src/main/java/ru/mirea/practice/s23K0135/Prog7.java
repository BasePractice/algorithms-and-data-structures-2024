package ru.mirea.practice.s23K0135;

import java.util.Scanner;

public abstract class Prog7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter ur number: ");
            int fin = 1;
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                fin *= i;
            }
            System.out.format("Ur result is: " + fin);
        }
    }
}
