package ru.mirea.practice.lab18.ex1;

import java.util.Scanner;


public abstract class Exception1 {
    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {

            System.out.print("Введите число:\n");
            try {
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите число.");
            } catch (ArithmeticException e) {
                System.out.println("Разрыв пространственно-временного континуума...\nШутка, но на ноль делить нельзя.");
            } finally {
                System.out.println("Выполнения блока try-catch завершено.");
            }
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
