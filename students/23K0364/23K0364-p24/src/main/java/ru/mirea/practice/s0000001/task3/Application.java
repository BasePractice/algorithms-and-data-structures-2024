package ru.mirea.practice.s0000001.task3;

import java.util.Scanner;

public class Application {
    private IDocument document;
    private final ICreateDocument factory;

    public Application(ICreateDocument factory) {
        this.factory = factory;
    }

    public void newDocument() {
        if (document != null) {
            document.close();
        }
        document = factory.createNew();
        document.open();
    }

    public void openDocument() {
        if (document != null) {
            document.close();
        }
        document = factory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document to save.");
        }
    }

    public void exit() {
        if (document != null) {
            document.close();
        }
        System.out.println("Exiting application.");
        System.exit(0);
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Menu: [1] New [2] Open [3] Save [4] Exit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        newDocument();
                        break;
                    case 2:
                        openDocument();
                        break;
                    case 3:
                        saveDocument();
                        break;
                    case 4:
                        exit();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        }
    }
}
