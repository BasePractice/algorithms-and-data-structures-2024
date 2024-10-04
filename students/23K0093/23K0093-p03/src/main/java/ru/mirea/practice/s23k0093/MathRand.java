package ru.mirea.practice.s23k0093;

//№3. Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//выведите его на экран в строку, далее определите и выведите на экран сообщение
//о том, является ли массив строго возрастающей последовательностью.

import java.util.Random;

public abstract class MathRand {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];

        // Заполняем массив случайными числами от 10 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // Генерация числа от 10 до 99
        }

        // Выводим массив на экран
        System.out.print("Сгенерированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Выводим результат
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
