package ru.mirea.practice.s0000001.task1.task1;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringOps strOps = new StringOpsImpl();

            System.out.print("Введите строку: ");
            String inputStr = sc.nextLine();

            System.out.println("Оригинальная строка: " + inputStr);
            System.out.println("Количество символов: " + strOps.countChars(inputStr));
            System.out.println("Символы на нечетных позициях: " + strOps.getOddChars(inputStr));
            System.out.println("Инвертированная строка: " + strOps.reverseStr(inputStr));
        }
    }
}