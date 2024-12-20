package ru.mirea.practice.s23k0375.task1;

import java.util.Scanner;

public final class StrTest {

    private StrTest() {
        throw new UnsupportedOperationException("Утилитный класс не должен быть создан");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            final String str = sc.nextLine();

            System.out.println("Выберите операцию:");
            System.out.println("1. Разбить строку на слова");
            System.out.println("2. Заменить все пробелы на дефисы");
            System.out.println("3. Найти все числа в строке");
            System.out.println("4. Удалить все цифры из строки");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    String[] words = str.split("\\s+");
                    System.out.println("Разбитые слова:");
                    for (String word : words) {
                        System.out.println(word);
                    }
                    break;
                case 2:
                    String rep = str.replaceAll("\\s+", "-");
                    System.out.println("Строка с замененными пробелами:");
                    System.out.println(rep);
                    break;
                case 3:
                    String[] nums = str.split("\\D+");
                    System.out.println("Найденные числа:");
                    for (String num : nums) {
                        if (!num.isEmpty()) {
                            System.out.println(num);
                        }
                    }
                    break;
                case 4:
                    String noDigits = str.replaceAll("\\d", "");
                    System.out.println("Строка без цифр:");
                    System.out.println(noDigits);
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
}
