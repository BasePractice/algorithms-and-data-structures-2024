package ru.mirea.practice.s0000001.task1;

import java.util.Locale;
import java.util.Scanner;

public final class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static TwoThreeTree tree = new TwoThreeTree();

    private Main() {
    }

    public static void run() {
        while (true) {
            System.out.println("Enter command (L, D, A, S, E):");
            String command = scanner.nextLine().trim().toUpperCase(Locale.ROOT);

            switch (command) {
                case "L":
                    tree.printByLevels();
                    break;

                case "D":
                    System.out.println("Enter key to delete:");
                    int deleteKey = Integer.parseInt(scanner.nextLine().trim());
                    boolean deleted = tree.delete(deleteKey);
                    if (deleted) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case "A":
                    System.out.println("Enter key to add:");
                    int addKey = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Enter processor name:");
                    String name = scanner.nextLine().trim();
                    System.out.println("Enter clock frequency (GHz):");
                    double clockFrequency = Double.parseDouble(scanner.nextLine().trim());
                    System.out.println("Enter cache size (KB):");
                    int cacheSize = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Enter bus frequency (GHz):");
                    double busFrequency = Double.parseDouble(scanner.nextLine().trim());
                    System.out.println("Enter SPECint result:");
                    int specint = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Enter SPECfp result:");
                    int specfp = Integer.parseInt(scanner.nextLine().trim());

                    ProcessorRecord record = new ProcessorRecord(addKey, name, clockFrequency, cacheSize, busFrequency, specint, specfp);
                    tree.insert(record);
                    System.out.println("Record added.");
                    break;

                case "S":
                    System.out.println("Saving to file...");
                    break;

                case "E":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
