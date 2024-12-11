package ru.mirea.practice.s0000001.task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class FileHandler {

    private FileHandler() {
    }

    public static List<ProcessorRecord> readFile(String filePath) {
        List<ProcessorRecord> records = new ArrayList<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(new File(filePath)));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) {
                    int key = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double clockFrequency = Double.parseDouble(parts[2].trim());
                    int cacheSize = Integer.parseInt(parts[3].trim());
                    double busFrequency = Double.parseDouble(parts[4].trim());
                    int specint = Integer.parseInt(parts[5].trim());
                    int specfp = Integer.parseInt(parts[6].trim());

                    ProcessorRecord record = new ProcessorRecord(
                        key, name, clockFrequency, cacheSize, busFrequency, specint, specfp);
                    records.add(record);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }

        return records;
    }
}
