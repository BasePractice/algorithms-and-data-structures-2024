package ru.mirea.practice.s23k0690;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Task1 {

    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {

        String[] names = {"Сигарета",
            "Пафнутий",
            "Мемема"};
        List<String> nameList = convertArrayToList(names);
        System.out.println("Список Имена: " + nameList);

        Integer[] numbers = {1,
            35,
            228,
            93,
            1488};
        List<Integer> numberList = convertArrayToList(numbers);
        System.out.println("Список Числа: " + numberList);

    }
}
