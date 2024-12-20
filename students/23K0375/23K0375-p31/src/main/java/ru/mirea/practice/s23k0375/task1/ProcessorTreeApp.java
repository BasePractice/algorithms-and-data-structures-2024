package ru.mirea.practice.s23k0375.task1;

import java.util.Scanner;

public final class ProcessorTreeApp {
    private ProcessorTreeApp() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        ProcessorTree tree = new ProcessorTree();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Menu:");
                System.out.println("1 - Add node");
                System.out.println("2 - Delete node");
                System.out.println("3 - Print variant 1 (bottom to top, left to right)");
                System.out.println("4 - Print variant 2 (top to bottom, left to right)");
                System.out.println("5 - Print variant 3 (left, root, right)");
                System.out.println("6 - Print variant 6 (levels with level numbers)");
                System.out.println("7 - Exit");
                System.out.print("Enter command: ");
                int command = scanner.nextInt();

                switch (command) {
                    case 1:
                        System.out.print("Enter key to add: ");
                        int keyToAdd = scanner.nextInt();
                        tree.add(keyToAdd);
                        break;

                    case 2:
                        System.out.print("Enter key to delete: ");
                        int keyToDelete = scanner.nextInt();
                        tree.delete(keyToDelete);
                        break;

                    case 3:
                        tree.printVariant1();
                        break;

                    case 4:
                        tree.printVariant2();
                        break;

                    case 5:
                        tree.printVariant3();
                        break;

                    case 6:
                        tree.printVariant6();
                        break;

                    case 7:
                        System.out.println("Exiting program.");
                        return;

                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
