package ru.mirea.practice.s23k0114.lab1;

import java.util.Scanner;

/**
 * Написать регулярное выражение, определяющее является ли данная
 * строка строкой "abcdefghijklmnopqrstuv18340" или нет.
 * a) пример правильных выражений:   abcdefghijklmnopqrstuv18340
 * b) пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340.
 */

public abstract class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String inp = sc.nextLine().strip();
            if (inp.matches("abcdefghijklmnopqrstuv18340")) {
                System.out.println("Введённая строка совпадает с: abcdefghijklmnopqrstuv18340");
            } else {
                System.out.println("Введённая строка не совпадает с: abcdefghijklmnopqrstuv18340");
            }
        }
    }
}
