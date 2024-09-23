package ru.mirea.practice.s23k0120.task10;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numOfWords = 0;
            System.out.print("Enter words: ");
            String s;
            s = sc.nextLine();
            numOfWords = s.split(" ").length;
            System.out.printf("%d words entered", numOfWords);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
