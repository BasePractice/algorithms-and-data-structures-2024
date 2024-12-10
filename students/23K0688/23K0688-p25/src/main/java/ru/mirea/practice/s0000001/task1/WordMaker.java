package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public abstract class WordMaker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Str:");
            String str = scanner.nextLine();
            System.out.println("3 = help");
            loop : while (true) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        String[] words = str.split("\\s+");
                        System.out.println("words:");
                        for (String word : words) {
                            System.out.println(word);
                        }
                        break;
                    case 2:
                        System.out.println("Exit");
                        scanner.close();
                        break loop;
                    case 3:
                        System.out.println("1. wordbreak");
                        System.out.println("2. close");
                        System.out.println("3. help");
                        break;
                    default :
                        break;
                }
            }
        }
    }
}
