package ru.mirea.practice.s23k0145.lab1;

import java.util.Scanner;

public final class TernaryTreeApp {
    private TernaryTreeApp() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            TernaryTree tree = new TernaryTree();

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1 - Add a node");
                System.out.println("2 - Delete a node");
                System.out.println("3 - Print tree (Variant 5: left, middle, right, then root, with levels)");
                System.out.println("4 - Exit");
                System.out.print("Choose an option: ");

                int command = scanner.nextInt();
                switch (command) {
                    case 1:
                        System.out.print("Enter the key to insert: ");
                        int keyToAdd = scanner.nextInt();
                        tree.insert(keyToAdd);
                        break;

                    case 2:
                        System.out.print("Enter the key to delete: ");
                        int keyToDelete = scanner.nextInt();
                        tree.delete(keyToDelete);
                        break;

                    case 3:
                        System.out.println("Tree structure (Variant 5):");
                        tree.printVariant5();
                        break;

                    case 4:
                        System.out.println("Exiting the program.");
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
    }

}

