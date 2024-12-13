package ru.mirea.practice.s23k0145.lab1;

import java.util.Arrays;
import java.util.List;

public abstract class ArrayToListConverter {

    public static <T> List<T> toList(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        String[] fruits = {"слон", "мышь", "заяц"};
        List<String> fruitList = toList(fruits);
        System.out.println("Список фруктов: " + fruitList);

        Double[] numbers = {1.1, 2.2, 3.3, 4.4};
        List<Double> numberList = toList(numbers);
        System.out.println("Список чисел: " + numberList);

        Character[] letters = {'A', 'B', 'C'};
        List<Character> letterList = toList(letters);
        System.out.println("Список букв: " + letterList);
    }
}
