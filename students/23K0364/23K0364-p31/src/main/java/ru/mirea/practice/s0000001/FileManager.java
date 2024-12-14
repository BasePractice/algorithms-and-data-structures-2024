package ru.mirea.practice.s0000001;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.io.File;

final class FileManager {
    private FileManager() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void loadFromFile(String filename, TwoThreeTree tree) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new IOException("Файл не найден: " + filename);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");
                Processor processor = new Processor(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]),
                    Integer.parseInt(data[3]), Double.parseDouble(data[4]),
                    Integer.parseInt(data[5]), Integer.parseInt(data[6]));
                tree.insert(processor);
            }
        }
    }

    public static void saveToFile(String filename, TwoThreeTree tree) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            List<Processor> processors = tree.toList();
            for (Processor processor : processors) {
                writer.write(processor.toString());
                writer.newLine();
            }
        }
    }
}
