package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        // Задание 1 (массив с Math.random() и Random)
        Random random = new Random();
        double[] array1 = new double[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Math.random();
        }
        System.out.println("Массив с использованием Math.random(): " + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Отсортированный массив: " + Arrays.toString(array1));

        double[] array2 = new double[10];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextDouble();
        }
        System.out.println("Массив с использованием Random: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Отсортированный массив: " + Arrays.toString(array2));

        // Задание 2 (классы Point, Circle, Tester)
        Tester tester = new Tester(5);
        for (int i = 0; i < 5; i++) {
            tester.addCircle(new Circle(new Point(random.nextInt(100), random.nextInt(100)), random.nextDouble() * 100));
        }
        System.out.println("Самая маленькая окружность: " + tester.getSmallestCircle());
        System.out.println("Самая большая окружность: " + tester.getLargestCircle());
        tester.sortCircles();
        System.out.println("Отсортированные окружности: " + Arrays.toString(tester.getCircles()));

        // Задание 3 (проверка возрастающего массива)
        int[] array3 = new int[4];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(90) + 10;
        }
        System.out.println("Массив: " + Arrays.toString(array3));
        boolean isIncreasing = true;
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] <= array3[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив строго возрастающий.");
        } else {
            System.out.println("Массив не является строго возрастающим.");
        }

        // Задание 4 (массив случайных чисел и четные элементы)
        try (Scanner scanner = new Scanner(System.in)) {
            int n;
            while (true) {
                System.out.println("Введите натуральное число больше 0: ");
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                }
            }
            int[] array4 = new int[n];
            for (int i = 0; i < n; i++) {
                array4[i] = random.nextInt(n + 1);
            }
            System.out.println("Массив: " + Arrays.toString(array4));

            int[] evenArray = Arrays.stream(array4).filter(x -> x % 2 == 0).toArray();
            System.out.println("Массив только с четными элементами: " + Arrays.toString(evenArray));
        }

        // Задание 5 (работа с классом Double)
        Double d1 = Double.valueOf(10.5);
        System.out.println("Создан объект Double: " + d1);

        String str = "20.5";
        double d2 = Double.parseDouble(str);
        System.out.println("Преобразованная строка к double: " + d2);

        byte b = d1.byteValue();
        short s = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();
        double d = d1.doubleValue();
        System.out.println("Преобразование Double ко всем примитивным типам: " + b + ", " + s + ", " + i + ", " + l + ", " + f + ", " + d);

        System.out.println("Значение объекта Double: " + d1);

        String dStr = Double.toString(3.14);
        System.out.println("Преобразование литерала double к строке: " + dStr);
    }
}
