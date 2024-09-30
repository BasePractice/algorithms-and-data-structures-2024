package ru.mirea.practice.s23k0362.prog8;

import java.util.Arrays;

public abstract class Moving {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < (array.length / 2); i++) {
            int cmt = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = cmt;
        }
        System.out.println(Arrays.toString(array));

        String[] strArray = {"Str1", "Str2", "Str3", "Str4"};
        for (int i = 0; i < (strArray.length / 2); i++) {
            String cmt = strArray[i];
            strArray[i] = strArray[strArray.length - i - 1];
            strArray[strArray.length - i - 1] = cmt;
        }
        System.out.println(Arrays.toString(strArray));
    }
}
