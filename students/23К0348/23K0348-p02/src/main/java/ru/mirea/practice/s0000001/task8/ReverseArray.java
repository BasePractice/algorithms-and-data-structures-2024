package ru.mirea.practice.s0000001.task8;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}