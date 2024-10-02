package ru.mirea.practice.s23f0011;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int counter = 0;
            System.out.print("Введите слова в строчку: ");
            String s;
            s = sc.nextLine();
            counter = s.split(" ").length;
            System.out.println("Вы ввели " + counter + " слов");
        }
    }
}
