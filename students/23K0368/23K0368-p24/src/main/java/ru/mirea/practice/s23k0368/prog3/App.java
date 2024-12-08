package ru.mirea.practice.s23k0368.prog3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private IDocument currentDocument;
    private final ICreateDocument documentFactory;

    public App(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. New");
                System.out.println("2. Open");
                System.out.println("3. Save");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = -1;
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Неверный ввод. Пожалуйста, введите число.");
                    scanner.next();
                    continue;
                }

                switch (choice) {
                    case 1:
                        try {
                            newDocument();
                        } catch (Exception e) {
                            System.err.println("Ошибка при создании нового документа: " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            openDocument();
                        } catch (Exception e) {
                            System.err.println("Ошибка при открытии документа: " + e.getMessage());
                        }
                        break;
                    case 3:
                        saveDocument();
                        break;
                    case 4:
                        exitApplication();
                        return;
                    default:
                        System.out.println("Неверный выбор. Пожалуйста, введите число от 1 до 4.");
                        break;
                }
            }
        }
    }

    private void newDocument() throws Exception {
        currentDocument = documentFactory.createNewDocument();
        System.out.println("Новый документ создан.");
    }

    private void openDocument() throws Exception {
        currentDocument = documentFactory.createOpen();
        System.out.println("Документ открыт.");
    }

    private void saveDocument() {
        if (currentDocument != null) {
            currentDocument.save();
        } else {
            System.out.println("Создайте или откройте документ перед сохранением.");
        }
    }

    private void exitApplication() {
        System.out.println("Приложение завершено.");
    }
}
