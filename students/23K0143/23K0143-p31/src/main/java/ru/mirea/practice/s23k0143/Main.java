package ru.mirea.practice.s23k0143;

import java.util.Scanner;
import java.io.IOException;

public abstract class Main {
    public static void main(String[] args) {
        ProcessorDatabase db = new ProcessorDatabase();
        try {
            db.loadFromFile("PROCS.TXT");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите команду (L, D n, A n, S, E):");
            while (true) {
                String command = scanner.nextLine();
                db.executeCommand(command);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
