package ru.mirea.practice.s0000001.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.trim().split("\\s+");
        System.out.println("Количество слов: " + words.length);
    }
}