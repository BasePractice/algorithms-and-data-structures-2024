package ru.mirea.practice.s23k0135.task1;

public final class Exception1 {

    private Exception1() {
    }

    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
// БЕЗ Try-Catch!
// Деление 2.0 / 0.0 (с использованием чисел с плавающей запятой).
// Результатом деления будет Infinity (бесконечность) для чисел с плавающей запятой.
// Программа не выдает ошибку и результат будет Infinity.

//С Try-Catch!
// Программа не выдает ошибку.
// Выводится сообщение: Attempted division by zero.

