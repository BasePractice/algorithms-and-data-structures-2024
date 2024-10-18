package ru.mirea.practice.s23l0908.Task8;

public class Main {
    public static void main(String[] args) {
        String[] Array = {"apple", "banana", "cherry", "blue berry"};
        System.out.println("Array from the begin:");
        printArray(Array);
        reverseArray(Array);
        System.out.println("Array after the reverse");
        printArray(Array);
    }

    public static void reverseArray(String[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
