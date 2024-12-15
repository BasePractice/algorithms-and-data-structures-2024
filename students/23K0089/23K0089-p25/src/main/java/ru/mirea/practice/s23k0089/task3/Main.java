package ru.mirea.practice.s23k0089.task3;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {

        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$";
        Pattern pattern = Pattern.compile(dateRegex);

        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
        }
        if (pattern.matcher(input).matches()) {
            System.out.println("Строка соответствует дате");
        } else {
            System.out.println("Строка не соответствует дате");
        }
    }
}
