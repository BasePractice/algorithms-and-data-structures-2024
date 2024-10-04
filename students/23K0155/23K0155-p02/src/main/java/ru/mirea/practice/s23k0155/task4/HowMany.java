package ru.mirea.practice.s23k0155.task4;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {

        System.out.println("Enter string:");
        try (Scanner scanner = new Scanner(System.in)) {
            String sentence = scanner.nextLine();

            int counter = 1;                    //счётчик слов
            boolean flag = true;                //флаг, того что предыдущий символ не пробел
            if (sentence.charAt(0) != ' ') {
                flag = false;
            }
            for (int i = 0; i < sentence.length(); i++) {
                if (flag && sentence.charAt(i) == ' ' && i != sentence.length() - 1) {
                    flag = false;
                    counter++;
                } else if (sentence.charAt(i) != ' ') {
                    flag = true;
                }
            }
            System.out.println("The number of words entered: " + counter);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
