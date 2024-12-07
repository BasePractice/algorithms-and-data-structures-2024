package ru.mirea.practice.s23k0143;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class ProcessorDatabase {
    private TwoThreeTree tree;

    public ProcessorDatabase() {
        tree = new TwoThreeTree();
    }

    public void loadFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                int key = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double clockSpeed = Double.parseDouble(parts[2].trim());
                int cacheSize = Integer.parseInt(parts[3].trim());
                double busSpeed = Double.parseDouble(parts[4].trim());
                int specInt = Integer.parseInt(parts[5].trim());
                int specFp = Integer.parseInt(parts[6].trim());
                ProcessorRecord record = new ProcessorRecord(key, name, clockSpeed, cacheSize, busSpeed, specInt, specFp);
                tree.insert(record);
            }
        }
    }

    public void executeCommand(String command) {
        switch (command.toUpperCase(Locale.ROOT)) {
            case "L":
                System.out.println("Вывод дерева по уровням:");
                tree.printLevelOrder();
                break;
            case "S":
                tree.saveToFile("PROCS.TXT");
                System.out.println("Данные сохранены в файл PROCS.TXT.");
                break;
            case "E":
                System.exit(0);
                break;
            default:
                if (command.startsWith("D ")) {
                    int key = Integer.parseInt(command.split(" ")[1]);
                    if (tree.delete(key)) {
                        System.out.println("Запись удалена.");
                    } else {
                        System.out.println("Запись не найдена.");
                    }
                } else if (command.startsWith("A ")) {
                    int key = Integer.parseInt(command.split(" ")[1]);
                    if (tree.search(key) != null) {
                        System.out.println("Запись с ключом " + key + " уже существует.");
                    } else {
                        addNewRecord(key);
                    }
                }
                break;
        }
    }

    private void addNewRecord(int key) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите название процессора:");
            final String name = scanner.nextLine();
            System.out.println("Введите тактовую частоту (ГГц):");
            final double clockSpeed = scanner.nextDouble();
            System.out.println("Введите размер кеш-памяти (Кб):");
            final int cacheSize = scanner.nextInt();
            System.out.println("Введите частоту системной шины (ГГц):");
            final double busSpeed = scanner.nextDouble();
            System.out.println("Введите результат теста SPECint:");
            final int specInt = scanner.nextInt();
            System.out.println("Введите результат теста SPECfp:");
            final int specFp = scanner.nextInt();
            scanner.nextLine();

            ProcessorRecord newRecord = new ProcessorRecord(key, name, clockSpeed, cacheSize, busSpeed, specInt, specFp);
            tree.insert(newRecord);
            System.out.println("Запись добавлена.");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}

