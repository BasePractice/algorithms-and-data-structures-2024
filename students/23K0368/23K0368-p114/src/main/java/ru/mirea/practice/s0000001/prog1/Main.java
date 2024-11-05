package ru.mirea.practice.s0000001.prog1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберите действие: ");
                System.out.println("1 - ввести строку и разбить её по выражению");
                System.out.println("0 - выйти из программы");

                if (scanner.hasNextInt()) {
                    int chouse = scanner.nextInt();
                    scanner.nextLine();

                    switch (chouse) {
                        case 1:
                            System.out.println("Введети строку: ");
                            String inputString = scanner.nextLine() + ' ';
                            System.out.println("Введенная строка " + inputString);
                            System.out.println("Выберите вариатн разбивки строки регулярным выражением");
                            System.out.println("1 - разделитель робел, 2 - разделитель запятая, 3 - разделитель тире");
                            int chouse2 = scanner.nextInt();
                            scanner.nextLine();
                            switch (chouse2) {
                                case 1:
                                    String[] parts = inputString.split("\\s+");
                                    for (int i = 0; i < parts.length; i++) {
                                        System.out.println("Элемент " + (i + 1) + ": " + parts[i]);
                                    }
                                    break;
                                case 2:
                                    String[] parts2 = inputString.split("\\s*,");
                                    for (int i = 0; i < parts2.length; i++) {
                                        System.out.println("Элемент " + (i + 1) + ": " + parts2[i]);
                                    }
                                    break;
                                case 3:
                                    String[] parts3 = inputString.split("\\s*-\\s*");
                                    for (int i = 0; i < parts3.length; i++) {
                                        System.out.println("Элемент " + (i + 1) + ": " + parts3[i]);
                                    }
                                    break;
                                default:
                                    System.out.println("Неверный выбор");
                                    break;
                            }
                            break;
                        case 0:
                            System.out.println("Выход из программы.");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Неверный выбор");
                            return;
                    }
                } else {
                    System.out.println("Введено неверное числло");
                    scanner.nextLine();
                }
            }
        }
    }
}
