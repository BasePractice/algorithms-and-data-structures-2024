package ru.mirea.practice.task2;

import java.util.Scanner;

public class GenericArray<T> {

    private T[] arr;

    public GenericArray(int s) {
        arr = (T[]) new Object[s];
    }

    public void set(int idx, T val) {
        if (idx >= 0 && idx < arr.length) {
            arr[idx] = val;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public T get(int idx) {
        if (idx >= 0 && idx < arr.length) {
            return arr[idx];
        } else {
            System.out.println("Index out of bounds");
            return null;
        }
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
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
                    GenericArray<String> strArr = new GenericArray<>(sz);
                    System.out.println("Введите элементы массива строк:");
                    for (int i = 0; i < sz; i++) {
                        strArr.set(i, sc.nextLine());
                    }
                    strArr.printArray();
                    break;

                case 2:
                    GenericArray<Integer> intArr = new GenericArray<>(sz);
                    System.out.println("Введите элементы массива целых чисел:");
                    for (int i = 0; i < sz; i++) {
                        intArr.set(i, sc.nextInt());
                    }
                    intArr.printArray();
                    break;

                case 3:
                    GenericArray<Double> dblArr = new GenericArray<>(sz);
                    System.out.println("Введите элементы массива чисел с плавающей запятой:");
                    for (int i = 0; i < sz; i++) {
                        dblArr.set(i, sc.nextDouble());
                    }
                    dblArr.printArray();
                    break;

                default:
                    System.out.println("Неверный выбор.");
                    break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
