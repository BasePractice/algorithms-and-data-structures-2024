package ru.mirea.practice.lab31.t1;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public abstract class ProcessorsTree {
    private static final Tree23 TREE_23 = new Tree23();

    public static void main(String[] args) {
        printWelcomeMessage();

        try (BufferedReader reader = new BufferedReader(new FileReader("PROCS.TXT"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int key = Integer.parseInt(parts[0].trim());
                TREE_23.insert(TREE_23.getRoot(), key);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите команду: ");
                String command = scanner.nextLine().trim().toUpperCase(Locale.ENGLISH);

                if ("E".equals(command)) {
                    break;
                } else if ("L".equals(command)) {
                    TREE_23.printLvl();
                } else if (command.startsWith("D")) {
                    int key = Integer.parseInt(command.substring(2).trim());
                    if (!TREE_23.delete(TREE_23.getRoot(), key)) {
                        System.out.println("Запись с ключом " + key + " не найдена.");
                    }
                } else if (command.startsWith("A")) {
                    int key = Integer.parseInt(command.substring(2).trim());
                    System.out.print("Введите данные (название, частота, кеш, частота шины, SPECint, SPECfp): ");
                    String[] parts = scanner.nextLine().split(",");
                    if (TREE_23.contains(TREE_23.getRoot(), key)) {
                        System.out.println("Запись с таким ключом уже существует.");
                    } else {
                        TREE_23.insert(TREE_23.getRoot(), key);
                    }
                } else if ("S".equals(command)) {
                    try (PrintWriter writer = new PrintWriter(new FileWriter("PROCS.TXT"))) {
                        for (String record : TREE_23.getAllRecords(TREE_23.getRoot())) {
                            writer.println(record);
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка записи в файл: " + e.getMessage());
                    }
                } else {
                    System.out.println("Неизвестная команда.");
                }
            }
        }
    }

    private static void printWelcomeMessage() {
        System.out.println("Добро пожаловать в программу управления деревом процессоров!");
        System.out.println("Доступные команды:");
        System.out.println("L - вывести на экран вершины дерева");
        System.out.println("D n - удалить запись с ключом n");
        System.out.println("A n - добавить запись с ключом n");
        System.out.println("S - сохранить все записи в файл");
        System.out.println("E - выйти из программы");
        System.out.println();
    }
}


