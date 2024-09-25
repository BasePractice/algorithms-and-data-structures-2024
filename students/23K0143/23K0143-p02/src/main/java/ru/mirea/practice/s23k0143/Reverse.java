package ru.mirea.practice.s23k0143;

public abstract class Reverse {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "3", "4", "5"};

        System.out.println("Исходный массив:");
        printArr(arr);

        reverseArray(arr);

        System.out.println("Массив после разворота:");
        printArr(arr);
    }

    public static void reverseArray(String[] array) {
        int l = 0;
        int r = array.length - 1;
        while (l < r) {
            String i = array[l];
            array[l] = array[r];
            array[r] = i;
            l += 1;
            r -= 1;
        }
    }

    public static void printArr(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
