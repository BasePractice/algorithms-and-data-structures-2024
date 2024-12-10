package ru.mirea.practice.s23k0140.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Main {


    public static void main(String[] args) {
        String strPattern;
        String stringToSplit;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите RegEx: ");
            strPattern = scanner.nextLine().replace("\\\\", "\\");
            System.out.print("Введите строку для разделения: ");
            stringToSplit = scanner.nextLine();
            scanner.nextInt();
        }
        Pattern pattern = Pattern.compile(strPattern);
        System.out.println(pattern.pattern());
        String[] words = pattern.split(stringToSplit);
        System.out.println(Arrays.toString(words));
    }
}