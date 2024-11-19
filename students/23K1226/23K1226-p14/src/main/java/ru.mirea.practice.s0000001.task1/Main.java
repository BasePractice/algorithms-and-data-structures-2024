package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class Main {

    private Main() {
        // Приватный конструктор для предотвращения создания экземпляров класса
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("1. Разбивка строки на элементы с помощью регулярных выражений:");
            String input1 = "abc123, def456, ghi789";
            String[] elements = input1.split("\\s*,\\s*");
            System.out.println(Arrays.toString(elements));

            System.out.println("\n2. Регулярное выражение для строки 'abcdefghijklmnopqrstuv18340':");
            String regex1 = "^[a-z]{26}18340$";
            String test1 = "abcdefghijklmnopqrstuv18340";
            System.out.println(test1.matches(regex1) ? "Верно" : "Неверно");

            System.out.println("\n3. Извлечение цен:");
            String text = "25.98 USD, 44 ERR, 0.004 EU";
            Pattern pattern = Pattern.compile("(\\d+(\\.\\d{1,2})?) (USD|RUB|EU)");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println("Цена: " + matcher.group(0));
            }

            System.out.println("\n4. Проверка наличия цифр без знака «+»:");
            String expr1 = "(1 + 8) – 9 / 4";
            String expr2 = "6 / 5 – 2 * 9";
            String regex4 = ".*\\d.*"; // Оптимизированное регулярное выражение
            System.out.println(expr1.matches(regex4) ? "Правильное выражение" : "Неверное выражение");
            System.out.println(expr2.matches(regex4) ? "Правильное выражение" : "Неверное выражение");

            System.out.println("\n5. Регулярное выражение для даты в формате dd/mm/yyyy:");
            String regex5 = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[12][0-9]{3}$";
            String testDate1 = "29/02/2000";
            String testDate2 = "29/02/2001";
            System.out.println(testDate1.matches(regex5) ? "Правильная дата" : "Неверная дата");
            System.out.println(testDate2.matches(regex5) ? "Правильная дата" : "Неверная дата");

            System.out.println("\n6. Проверка на допустимый e-mail согласно RFC 2822:");
            String regexEmail = "^[A-Za-z0-9]+([._%+-][A-Za-z0-9]+)*@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            String email1 = "user@example.com";
            String email2 = "myhost@@@com.ru";
            System.out.println(email1.matches(regexEmail) ? "Правильный e-mail" : "Неверный e-mail");
            System.out.println(email2.matches(regexEmail) ? "Правильный e-mail" : "Неверный e-mail");

            System.out.println("\n7. Проверка надежности пароля:");
            String regexPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
            String password1 = "F032_Password";
            String password2 = "smart_pass";
            System.out.println(password1.matches(regexPassword) ? "Надежный пароль" : "Ненадежный пароль");
            System.out.println(password2.matches(regexPassword) ? "Надежный пароль" : "Ненадежный пароль");

            System.out.println("\n8. Пример метода filter для удаления лишних элементов:");
            String[] array = {"apple", "banana", "pear", "orange"};
            String[] filteredArray = filter(array, s -> s.length() > 5);
            System.out.println(Arrays.toString(filteredArray));

            System.out.println("\n9. Частотный словарь для букв русского алфавита:");
            String textForFreqDict = "съешь еще этих мягких французских булок да выпей чаю";
            Map<Character, Long> freqMap = textForFreqDict.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> Character.isLetter(c))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            freqMap.forEach((k, v) -> System.out.println(k + ": " + v));

        }
    }

    public static <T> T[] filter(T[] array, Filter<T> filter) {
        return Arrays.stream(array)
            .filter(filter::apply)
            .toArray(size -> Arrays.copyOf(array, size));
    }

    interface Filter<T> {
        boolean apply(T t);
    }
}
