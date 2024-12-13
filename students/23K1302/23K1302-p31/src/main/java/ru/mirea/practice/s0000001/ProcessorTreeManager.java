package ru.mirea.practice.s0000001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProcessorTreeManager {
    private static final String FILE_NAME = "PROCS.TXT";
    private TwoThreeTree tree = new TwoThreeTree();

    public void loadFromFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int key = Integer.parseInt(parts[0]);
                String name = parts[1];
                double clockSpeed = Double.parseDouble(parts[2]);
                int cacheSize = Integer.parseInt(parts[3]);
                double busSpeed = Double.parseDouble(parts[4]);
                int specInt = Integer.parseInt(parts[5]);
                int specFp = Integer.parseInt(parts[6]);
                tree.insert(new Processor(key, name, clockSpeed, cacheSize, busSpeed, specInt, specFp));
            }
        }
    }


    public void saveToFile() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Processor p : tree.getAllRecords()) {
                bw.write(p.toString());
                bw.newLine();
            }
        }
    }

    public void run() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) { // Используем try-with-resources
            while (true) {
                System.out.print("Enter command: ");
                String command = scanner.nextLine();
                switch (command.charAt(0)) {
                    case 'L':
                        tree.printTree();
                        break;
                    case 'D':
                        int deleteKey = Integer.parseInt(command.substring(2));
                        tree.delete(deleteKey);
                        break;
                    case 'A':
                        int addKey = Integer.parseInt(command.substring(2));
                        Processor newProcessor = new Processor(addKey, "Default Name", 3.5, 8, 1600, 1000, 2000);
                        tree.insert(newProcessor);
                        break;
                    case 'S':
                        saveToFile();
                        break;
                    case 'E':
                        return; // Автоматически закроет Scanner
                    default:
                        System.out.println("Invalid command");
                        break;
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        ProcessorTreeManager manager = new ProcessorTreeManager();
        manager.loadFromFile();
        manager.run();
    }
}
