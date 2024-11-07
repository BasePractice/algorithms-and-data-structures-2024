package ru.mirea.practice.s23k1158.t1.t2;

import java.util.Scanner;

public final class Except2 {

    private Except2() {

    }

    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Введите целое: ");
                String intString = myScanner.next();
                try {
                    int i = Integer.parseInt(intString);
                    System.out.println(2 / i);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка.");
                } catch (ArithmeticException e) {
                    System.out.println("Невозможно разделить на ноль. Пожалуйста, введите ненулевое целое число.");
                }
            }
        }
    }
}