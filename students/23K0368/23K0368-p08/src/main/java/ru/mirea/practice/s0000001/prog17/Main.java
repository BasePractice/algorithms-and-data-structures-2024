package ru.mirea.practice.s0000001.prog17;

import java.util.Scanner;

public abstract class Main {
    public static void maxel() {
        try (Scanner scanner = new Scanner(System.in)) {
            int max = 0;
            System.out.print("Enter number: ");
            int cmt = scanner.nextInt();

            while (cmt != 0) {
                if (cmt > max) {
                    max = cmt;
                }
                System.out.print("Enter number: ");
                cmt = scanner.nextInt();
            }
            System.out.println(max);
        }
    }


    public static void main(String[] args) {
        maxel();
    }
}
