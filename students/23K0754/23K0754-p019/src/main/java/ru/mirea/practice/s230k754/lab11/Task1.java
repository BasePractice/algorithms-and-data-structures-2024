package ru.mirea.practice.s230k754.lab11;

import org.jetbrains.annotations.NotNull;
import java.util.Scanner;

public final class Task1 {
    private Task1() {}

    public static boolean isValidInn(@NotNull String inn) {
        if (inn.length() != 12) {
            return false;
        }
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < inn.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(inn.charAt(i)));
            if (i % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
        }
        return sumEven == sumOdd;
    }


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                if (!isValidInn(scanner.next())) {
                    throw new IllegalArgumentException("Введен недействительный ИНН.");
                }
                System.out.println("Заказ оформлен успешно ");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
