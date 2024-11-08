package ru.mirea.practice.s0000001.prog2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ввдетите строку для сравнения");
            String inputString = scanner.nextLine();
            Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
            Matcher matcher = pattern.matcher(inputString);
            if (matcher.find()) {
                System.out.println("Введенная вами строка является заданной строкой " + matcher.group());
            } else {
                System.out.println("Введенная строка не является заданной строкой(");
            }
        }
    }
}
