package ru.mirea.practice.s0000001.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class ProcessorTree {
    public static void main(String[] args) {
        TwoThreeTree tree = new TwoThreeTree();

        // Чтение данных из файла
        try (BufferedReader reader = new BufferedReader(new FileReader("PROCS.TXT"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                int key = Integer.parseInt(parts[0]);
                tree.insert(key);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Используем try-with-resources для Scanner, чтобы автоматически закрыть его
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Введите команду (L, D n, A n, S, E): ");
                String command = scanner.nextLine().trim();
                if ("L".equals(command)) {
                    tree.printTree();
                } else if (command.startsWith("D ")) {
                    // Логика удаления здесь (пока не реализована)
                    System.out.println("Удаление не реализовано.");
                } else if (command.startsWith("A ")) {
                    // Логика добавления здесь (пока не реализована)
                    System.out.println("Добавление не реализовано.");
                } else if ("S".equals(command)) {
                    try {
                        tree.saveToFile("PROCS.TXT");
                    } catch (IOException e) {
                        System.err.println("Ошибка при сохранении файла: " + e.getMessage());
                    }
                } else if ("E".equals(command)) {
                    break;
                }
            }
        }
    }
}