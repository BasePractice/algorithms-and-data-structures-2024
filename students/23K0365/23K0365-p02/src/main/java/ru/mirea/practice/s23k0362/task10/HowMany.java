package ru.mirea.practice.s23k0362.task10;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Sentence:");

            String line = sc.nextLine();

            if (line != null) {
                String[] words = line.split("\\s+");
                System.out.println(words.length);
            } else {
                System.out.println(0);
            }
        }
    }
}
