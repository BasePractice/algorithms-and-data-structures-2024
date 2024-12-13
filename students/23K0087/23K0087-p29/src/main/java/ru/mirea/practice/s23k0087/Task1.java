package ru.mirea.practice.s23k0087;

import java.util.Scanner;

public abstract class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res += scanner.nextInt();
                }
            }
            res /= 2;
            System.out.println(res);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
