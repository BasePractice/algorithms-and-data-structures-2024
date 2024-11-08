package ru.mirea.practice.s0000001.prog1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class Main {
    private static final String FILE_NAME = "developers.txt";

    private static void updateDeveloperFile(String developerName, LocalDateTime endTime) {
        try {
            // Читаем строки из файла
            List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));

            // Находим строку с разработчиком
            boolean found = false;
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (line.startsWith("Имя разработчика " + developerName + ",")) {
                    // Дописываем время завершения к строке
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    lines.set(i, line + ", Время сдачи работы: " + endTime.format(formatter));
                    found = true;
                    break;
                }
            }

            // Если запись о разработчике не найдена, ничего не делаем
            if (!found) {
                System.out.println("Разработчик не найден в файле.");
                return;
            }

            // Записываем обновленное содержимое в файл
            Files.write(Paths.get(FILE_NAME), lines);
            System.out.println("Время завершения задачи записано в файл.");

        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    private static void saveDeveloperToFile(String name, String group, LocalDateTime startTime) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            writer.write("Имя разработчика " + name + ", Группа: " + group + ", Время получения работы: "
                    + startTime.format(formatter) + "\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, Developer> developers = new HashMap<>();
            boolean cont = true;
            while (cont) {
                System.out.println("0-завершить, 1-добавить разработчика и начать задачу, 2- выбрать разработчика и"
                        + " завершить задачу");

                if (scanner.hasNextInt()) { // Проверка ввода числа
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Считывание оставшейся строки

                    switch (n) {
                        case 0:
                            System.out.println("Завершение программы");
                            cont = false;
                            break;
                        case 1:
                            System.out.println("Добавление нового разработчика: ");
                            System.out.println("Введите имя разработчика, группу и время получения практической работы");
                            String name = scanner.nextLine();
                            String group = scanner.nextLine();
                            LocalDateTime now = LocalDateTime.now();
                            developers.put(name, new Developer(name, group, now));

                            saveDeveloperToFile(name, group, now); // Добавление разработчика в файл
                            break;
                        case 2:
                            System.out.println("Выберите разработчика для завершения задачи");
                            String developerName = scanner.nextLine();
                            Developer found = developers.get(developerName);

                            if (found != null) {
                                LocalDateTime end = LocalDateTime.now();
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                                System.out.println(found + ", Время завершения: " + end.format(formatter));

                                updateDeveloperFile(developerName, end); // Обновления данных разработчика в файле
                            } else {
                                System.out.println("Разработчик не найден.");
                            }
                            break;
                        default:
                            System.out.println("Неверный выбор.");
                            break;
                    }
                } else {
                    System.out.println("Неверный ввод. Введите число.");
                    scanner.nextLine(); // Считывание неверного ввода
                }
            }
        }
    }
}
