package ru.mirea.practice.s0000001;

import java.io.IOException;
import java.util.Scanner;

public abstract class Main {
    private static TwoThreeTree tree = new TwoThreeTree();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                FileManager.loadFromFile("/Users/viktoriapermakova/Desktop/PROCS.TXT", tree);
                System.out.println("Данные загружены.");
            } catch (IOException e) {
                System.err.println("Ошибка загрузки данных: " + e.getMessage());
            }

            while (true) {
                System.out.print("Введите команду (L, D n, A n, S, E): ");
                String command = scanner.nextLine();

                if ("L".equalsIgnoreCase(command)) {
                    tree.printTree();
                } else if (command.startsWith("D")) {
                    try {
                        int key = Integer.parseInt(command.split(" ")[1]);
                        tree.delete(key);
                        System.out.println("Запись с ключом " + key + " удалена.");
                    } catch (Exception e) {
                        System.err.println("Ошибка удаления: " + e.getMessage());
                    }
                } else if (command.startsWith("A")) {
                    try {
                        int key = Integer.parseInt(command.split(" ")[1]);
                        System.out.print("Введите данные процессора (название, тактовая частота, кеш, частота шины, SPECint, SPECfp): ");
                        String[] data = scanner.nextLine().split(", ");
                        Processor processor = new Processor(key, data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]),
                            Double.parseDouble(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]));
                        tree.insert(processor);
                        System.out.println("Запись добавлена: " + processor);
                    } catch (Exception e) {
                        System.err.println("Ошибка добавления: " + e.getMessage());
                    }
                } else if ("S".equalsIgnoreCase(command)) {
                    try {
                        FileManager.saveToFile("/Users/viktoriapermakova/Desktop/PROCS.TXT", tree);
                        System.out.println("Данные сохранены в файл.");
                    } catch (IOException e) {
                        System.err.println("Ошибка сохранения данных: " + e.getMessage());
                    }
                } else if ("E".equalsIgnoreCase(command)) {
                    break;
                } else {
                    System.out.println("Неизвестная команда.");
                }
            }
        }
    }
}

