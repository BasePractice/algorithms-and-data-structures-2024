package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;
import java.util.Locale;

public final class Main {
    public static void main(String[] args) {
        // Ресурс Scanner внутри блока try-with-resources, чтобы закрывать его правильно
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Задание 1:");
            task1("I like Java!!!");

            System.out.println("\nЗадание 2:");
            Person person = new Person("Иван", "Иванович", "Иванов");
            System.out.println(person.getFullName());

            System.out.println("\nЗадание 3:");
            Address address1 = new Address("Россия, Москва, Тверская, 12, 3, 34");
            System.out.println(address1);

            System.out.println("\nЗадание 4:");
            String[] shirts = new String[] {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T- Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
            };
            Shirt[] shirtArray = Shirt.convertToShirts(shirts);
            for (Shirt shirt : shirtArray) {
                System.out.println(shirt);
            }

            System.out.println("\nЗадание 5:");
            System.out.println(formatPhoneNumber("+79175655655"));
            System.out.println(formatPhoneNumber("89175655655"));

            System.out.println("\nЗадание 6:");
            System.out.print("Введите имя файла с содержимым: ");
            String filename = scanner.nextLine();
            getLine(filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void task1(String input) {
        System.out.println("Последний символ: " + input.charAt(input.length() - 1));
        System.out.println("Заканчивается ли строка на '!!!': " + input.endsWith("!!!"));
        System.out.println("Начинается ли строка с 'I like': " + input.startsWith("I like"));
        System.out.println("Содержит ли строка подстроку 'Java': " + input.contains("Java"));
        System.out.println("Позиция подстроки 'Java': " + input.indexOf("Java"));
        System.out.println("После замены 'а' на 'о': " + input.replace('а', 'о'));
        System.out.println("Строка в верхнем регистре: " + input.toUpperCase(Locale.ROOT));
        System.out.println("Строка в нижнем регистре: " + input.toLowerCase(Locale.ROOT));
        System.out.println("Подстрока 'Java': " + input.substring(input.indexOf("Java")));
    }

    public static String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            return phoneNumber.replaceFirst("(\\+\\d{1,3})(\\d{3})(\\d{3})(\\d{4})", "$1$2-$3-$4");
        }
        return phoneNumber.replaceFirst("(8)(\\d{3})(\\d{3})(\\d{4})", "+7$2-$3-$4");
    }

    public static void getLine(String filename) {
        StringBuilder result = new StringBuilder();
        String[] words = filename.split(" ");
        for (String word : words) {
            result.append(word).append(" ");
        }
        System.out.println(result.toString().trim());
    }

    // Приватный конструктор для предотвращения создания экземпляров
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }
}
