package ru.mirea.practice.s0000002;

import java.util.Arrays;
import java.util.Random;

public final class Ex1 {
    private Ex1() {
        // Тут всё ещё пусто
    }

    public static void main(String[] args) {
        int size = 10;
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        for (int i = 0; i < size; i++) {
            array1[i] = (int) (Math.random() * 100);
        }

        new Random();
        for (int i = 0; i < size; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
        // Выполнить задание иначе не получилось, ругается PMD

        System.out.println("Генерация случайных чисел с помощью Math.random(): " + Arrays.toString(array1));
        System.out.println("Генерация случайных чисел с помощью класса Random: " + Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("Массив Math.random() после сортировки: " + Arrays.toString(array1));
        System.out.println("Массив класс Random после сортировки: " + Arrays.toString(array2));
    }
}
