package ru.mirea.practice.s23k0368.prog3;

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
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> newDocument();
                    case 2 -> openDocument();
                    case 3 -> saveDocument();
                    case 4 -> {
                        exitApplication();
                        return;
                    }
                    default -> System.out.println("Ну вот как так то, написано же, что вводить то нужно");

                }
            }
        }
    }

    private void newDocument() {
        currentDocument = documentFactory.createNewDocument();
        System.out.println("Новый документ создан");
    }

    private void openDocument() {
        currentDocument = documentFactory.createOpen();
        System.out.println("Документ открыт");
    }

    private void saveDocument() {
        if (currentDocument != null) {
            currentDocument.save();
        } else {
            System.out.println("Нет открытого документа");
        }
    }

    private void exitApplication() {
        System.out.println("Приложение завершено");
    }
}
