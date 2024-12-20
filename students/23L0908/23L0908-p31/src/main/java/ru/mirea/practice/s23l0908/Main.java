package ru.mirea.practice.s23l0908;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        TwoThreeTree tree = new TwoThreeTree();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/ru/mirea/practice/s00000030/task1/PROCS.TXT"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ProcessorRecord record = ProcessorRecord.fromString(line);
                tree.insert(record);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter the command (L, D n, A n, S, E): ");
                String command = scanner.nextLine().trim();

                if ("E".equalsIgnoreCase(command)) {
                    break;
                }

                if ("L".equalsIgnoreCase(command)) {
                    System.out.println("Enter a workaround (1-6): ");
                    int variant = scanner.nextInt();
                    scanner.nextLine();
                    tree.print(variant);
                } else if (command.startsWith("D")) {
                    try {
                        int key = Integer.parseInt(command.substring(2).trim());
                        tree.delete(key);
                    } catch (NumberFormatException e) {
                        System.out.println("Incorrect key.");
                    }
                } else if (command.startsWith("A")) {
                    try {
                        int key = Integer.parseInt(command.substring(2).trim());
                        if (!tree.contains(key)) {
                            System.out.print("Enter processor information (for example: Intel Pentium 4, 2.0, 256, 0.400, 664, 734): ");
                            String recordInfo = scanner.nextLine().trim();
                            ProcessorRecord record = ProcessorRecord.fromString(key + ", " + recordInfo);
                            tree.insert(record);
                        } else {
                            System.out.println("A record with this key already exists.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Incorrect key.");
                    }
                } else if ("S".equalsIgnoreCase(command)) {
                    tree.saveToFile("src/ru/mirea/practice/s00000030/task1/PROCS.TXT");
                    System.out.println("Data saved to file.");
                } else {
                    System.out.println("Unknown team.");
                }
            }
        }
    }
}
