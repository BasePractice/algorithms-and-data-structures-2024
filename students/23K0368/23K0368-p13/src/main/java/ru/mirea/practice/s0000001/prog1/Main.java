package ru.mirea.practice.s0000001.prog1;

import java.util.Locale;
import java.util.Scanner;

public abstract class Main {
    public static void stringMetod(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //Задание 1
            String str = sc.nextLine();
            stringMetod(str);

            //Задание 2
            System.out.println(str.charAt(str.length() - 1));

            //Задание 3
            System.out.println(str.endsWith("!!!"));

            //Задание 4
            System.out.println(str.startsWith("I like"));

            //Задание 5
            System.out.println(str.contains("Java"));

            //Задание 6
            String s = "I like Java";
            System.out.println("Start" + s.indexOf("Java") + "End" + s.lastIndexOf("Java"));

            //Задание 7
            System.out.println(s.replace('a', 'o'));

            //Задание 8
            System.out.println(s.toUpperCase(Locale.ENGLISH));

            //Задание 9
            System.out.println(s.toLowerCase(Locale.ENGLISH));

            //Задание10
            System.out.println(s.substring(0, s.indexOf("Java")));
        }
    }
}
