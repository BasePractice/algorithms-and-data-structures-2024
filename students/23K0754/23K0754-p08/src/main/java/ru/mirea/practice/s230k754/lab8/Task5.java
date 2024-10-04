package ru.mirea.practice.s230k754.lab8;

import java.util.Scanner;

public final class Task5 {
    private Task5() {}

    public static int function(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + function(n / 10);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(function(scanner.nextInt()));
        }
    }
}
