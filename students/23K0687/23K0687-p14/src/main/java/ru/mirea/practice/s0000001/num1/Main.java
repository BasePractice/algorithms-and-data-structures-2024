package ru.mirea.practice.s0000001.num1;

import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            String str = sc.nextLine();
            String[] words = str.split("\\s+");
            System.out.println("Элементы строки:");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }
}
