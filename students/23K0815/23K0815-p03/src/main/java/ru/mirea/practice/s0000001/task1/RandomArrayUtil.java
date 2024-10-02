package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayUtil {

    private int size;

    public RandomArrayUtil(int size) {
        this.size = size;
    }

    public double[] generateArrayWithMathRandom() {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * 100;
        }
        return array;
    }

    public double[] generateArrayWithRandom() {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble() * 100;
        }
        return array;
    }

    public double[] sortArray(double[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        int size = 10;
        RandomArrayUtil util = new RandomArrayUtil(size);

        System.out.println("Массив, сгенерированный с использованием Math.random(): ");
        double[] mathRandomArray = util.generateArrayWithMathRandom();
        System.out.println(Arrays.toString(mathRandomArray));

        mathRandomArray = util.sortArray(mathRandomArray);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(mathRandomArray));

        System.out.println("nМассив, сгенерированный с использованием класса Random:");
        double[] randomArray = util.generateArrayWithRandom();
        System.out.println(Arrays.toString(randomArray));

        randomArray = util.sortArray(randomArray);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(randomArray));
    }
}