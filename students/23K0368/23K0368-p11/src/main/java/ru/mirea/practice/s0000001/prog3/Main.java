package ru.mirea.practice.s0000001.prog3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Main {
    private static LocalDate parseDate(String inputBirthDate) {
        try {
            // Проверка формата "YYYY-MM-DD"
            return LocalDate.parse(inputBirthDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (Exception e) {
            try {
                // Проверка формата "dd MMMM yyyy" (например, 1 января 2000)
                return LocalDate.parse(inputBirthDate, DateTimeFormatter.ofPattern("d MMMM yyyy"));
            } catch (Exception ex) {
                try {
                    // Проверка формата "dd.MM.yyyy" (например, 01.01.2000)
                    return LocalDate.parse(inputBirthDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                } catch (Exception exc) {
                    return null;
                }
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, Student> students = new HashMap<>();

            boolean input = true;
            while (input) {
                System.out.println("0 - завершить, 1 - добавить студента, 2 - посмотреть информацию о студентах");

                if (scanner.hasNextInt()) {
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Считывание оставшейся строки

                    switch (n) {
                        case 1:
                            System.out.println("Введите имя студента, возраст, группу, и дату его рождения на отдельных строках:");
                            String name = scanner.nextLine();
                            int age = scanner.nextInt();
                            scanner.nextLine(); // Считывание оставшейся строки
                            String group = scanner.nextLine();
                            System.out.println("Введите дату рождения студента (любой формат):");
                            String inputBirthDate = scanner.nextLine();

                            LocalDate birthDate = parseDate(inputBirthDate);

                            if (birthDate != null) {
                                Student student = new Student(name, age, group, birthDate);
                                students.put(name, student); // Добавление студента в HashMap
                                System.out.println("Студент добавлен.");
                            } else {
                                System.out.println("Неверный формат даты рождения.");
                            }
                            break;
                        case 2:
                            if (students.isEmpty()) {
                                System.out.println("Список студентов пуст.");
                            } else {
                                for (Map.Entry<String, Student> entry : students.entrySet()) {
                                    System.out.println("Имя: " + entry.getKey() + ", Возраст: "
                                        + entry.getValue().getAge() + ", Группа: " + entry.getValue().getGroup()
                                        + ", Дата рождения: " + entry.getValue().getBirthday());
                                }
                            }
                            break;
                        case 0:
                            input = false;
                            break;
                        default:
                            System.out.println("Неверный выбор.");
                            break;
                    }
                } else {
                    System.out.println("Неверный ввод. Введите число.");
                    scanner.nextLine();
                }
            }
        }
    }
}
