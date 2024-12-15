package ru.mirea.practice.s23k0135.task1;

import java.util.List;

import static ru.mirea.practice.s23k0135.task1.Task1.convertArrayToList;

public abstract class Test {
    public static void main(String[] args) {
        Integer[] numbers = {5, 6, 8, 3, 2, 1};
        List<Integer> numberList = convertArrayToList(numbers);
        System.out.println(numberList);

        Integer[] emptyArray = new Integer[15];
    }
}
