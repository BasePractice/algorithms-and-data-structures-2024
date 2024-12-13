package ru.mirea.practice.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Main {

    private Main() {}

    public static <T> List<T> convertToList(T[] arr) {
        List<T> list = new ArrayList<>();
        for (T el : arr) {
            list.add(el);
        }
        return list;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Выберите тип массива для конвертации в список:");
            System.out.println("1. Массив строк");
            System.out.println("2. Массив чисел");
            System.out.print("Введите номер варианта (1 или 2): ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Введите количество строк: ");
                int n = sc.nextInt();
                sc.nextLine();
                String[] strArr = new String[n];

                System.out.println("Введите строки:");
                for (int i = 0; i < n; i++) {
                    strArr[i] = sc.nextLine();
                }

                List<String> strList = convertToList(strArr);
                System.out.println("Список строк: " + strList);
            } else if (ch == 2) {
                System.out.print("Введите количество чисел: ");
                int n = sc.nextInt();
                Integer[] numArr = new Integer[n];

                System.out.println("Введите числа:");
                for (int i = 0; i < n; i++) {
                    numArr[i] = sc.nextInt();
                }

                List<Integer> numList = convertToList(numArr);
                System.out.println("Список чисел: " + numList);
            } else {
                System.out.println("Неверный выбор!");
            }
        }
    }
}
