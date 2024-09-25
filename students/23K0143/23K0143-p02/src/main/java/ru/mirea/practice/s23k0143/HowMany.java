package ru.mirea.practice.s23k0143;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in);) {

            System.out.println("Введите текст: ");
            String s = sc.nextLine();

            int wordCnt = 0;
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                char elem = s.charAt(i);
                if (Character.isWhitespace(elem)) {
                    if (flag) {
                        flag = false;
                    }
                } else {
                    if (!flag) {
                        wordCnt++;
                        flag = true;
                    }
                }
            }
            System.out.println("Количество слов: " + wordCnt);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
