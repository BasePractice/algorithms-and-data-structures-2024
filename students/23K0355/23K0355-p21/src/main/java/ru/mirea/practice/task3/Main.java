package ru.mirea.practice.task3;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Выберите тип массива для работы:");
            System.out.println("1. Массив строк");
            System.out.println("2. Массив целых чисел");
            System.out.println("3. Массив чисел с плавающей запятой");
            System.out.print("Введите номер варианта (1, 2 или 3): ");
            final int ch = sc.nextInt();
            sc.nextLine();

            System.out.print("Введите размер массива: ");
            final int sz = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    String[] sa = new String[sz];
                    System.out.println("Введите элементы массива строк:");
                    for (int i = 0; i < sz; i++) {
                        sa[i] = sc.nextLine();
                    }
                    System.out.print("Введите индекс для получения элемента: ");
                    int is = sc.nextInt();
                    System.out.println("Элемент по индексу " + is + ": " + getElement(sa, is));
                    break;

                case 2:
                    Integer[] ia = new Integer[sz];
                    System.out.println("Введите элементы массива целых чисел:");
                    for (int i = 0; i < sz; i++) {
                        ia[i] = sc.nextInt();
                    }
                    System.out.print("Введите индекс для получения элемента: ");
                    int ii = sc.nextInt();
                    System.out.println("Элемент по индексу " + ii + ": " + getElement(ia, ii));
                    break;

                case 3:
                    Double[] da = new Double[sz];
                    System.out.println("Введите элементы массива чисел с плавающей запятой:");
                    for (int i = 0; i < sz; i++) {
                        da[i] = sc.nextDouble();
                    }
                    System.out.print("Введите индекс для получения элемента: ");
                    int id = sc.nextInt();
                    System.out.println("Элемент по индексу " + id + ": " + getElement(da, id));
                    break;

                default:
                    System.out.println("Неверный выбор.");
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> T getElement(T[] arr, int idx) {
        if (idx >= 0 && idx < arr.length) {
            return arr[idx];
        } else {
            System.out.println("Индекс выходит за пределы массива.");
            return null;
        }
    }
}
