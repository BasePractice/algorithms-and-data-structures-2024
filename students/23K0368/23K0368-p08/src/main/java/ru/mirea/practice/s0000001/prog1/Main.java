package ru.mirea.practice.s0000001.prog1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите длинну последовательности");
            int n = scanner.nextInt();
            for (int i = 0; i < n + 1; i++) {
                String str = Integer.toString(i);
                String repeatedString = str.repeat(i).replace(str, str + " ");
                System.out.print(repeatedString);
            }
        }
    }
}