package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class RegalTasks {

    private RegalTasks() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1. Введите строку для разбиения по пробелам:");
            String input = scanner.nextLine();
            String[] splitResult = input.split("\\s+");
            for (String part : splitResult) {
                System.out.println("Часть строки: " + part);
            }

            System.out.println("\n2. Проверьте, соответствует ли строка 'abcdefghijklmnopqrstuv18340':");
            input = scanner.nextLine();
            boolean isExactMatch = input.matches("abcdefghijklmnopqrstuv18340");
            System.out.println("Соответствует: " + isExactMatch);

            System.out.println("\n3. Введите текст для извлечения цен в USD, RUB, или EU:");
            input = scanner.nextLine();
            Matcher priceMatcher = Pattern.compile("\\b\\d+\\.\\d{2}\\s?(USD|RUB|EU)\\b").matcher(input);
            while (priceMatcher.find()) {
                System.out.println("Найдена цена: " + priceMatcher.group());
            }

            System.out.println("\n4. Введите текст, чтобы проверить, есть ли числа без знака '+':");
            input = scanner.nextLine();
            boolean hasNumberWithoutPlus = Pattern.compile("\\b\\d+(?!\\+)").matcher(input).find();
            System.out.println("Числа без знака '+': " + hasNumberWithoutPlus);

            System.out.println("\n5. Проверьте, является ли строка датой в формате dd/mm/yyyy:");
            input = scanner.nextLine();
            boolean isValidDate = input.matches("^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/((19\\d{2})|([2-9]\\d{3}))$");
            System.out.println("Допустимый формат даты: " + isValidDate);

            System.out.println("\n6. Введите email для проверки на корректность:");
            input = scanner.nextLine();
            boolean isValidEmail = input.matches("^[\\w.!#$%&'*+/=?^_`{|}~-]+@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*$");
            System.out.println("Корректный email: " + isValidEmail);

            System.out.println("\n7. Введите пароль для проверки его надежности:");
            input = scanner.nextLine();
            boolean isStrongPassword = input.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]{8,}$");
            System.out.println("Надежный пароль: " + isStrongPassword);

        }
    }
}
