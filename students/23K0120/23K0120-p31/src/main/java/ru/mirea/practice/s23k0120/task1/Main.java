package ru.mirea.practice.s23k0120.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TwoThreeTree<Processor> processorTree = new TwoThreeTree<Processor>();
        try (Scanner scanner = new Scanner(new File("students/23K0120/23K0120-p31/src/main/java/ru/mirea/practice/s23k0120/task1/PROCS.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(", ");
                Processor processor = new Processor(Integer.parseInt(splitLine[0]),
                    splitLine[1],
                    Double.parseDouble(splitLine[2]),
                    Integer.parseInt(splitLine[3]),
                    Double.parseDouble(splitLine[4]),
                    Integer.parseInt(splitLine[5]),
                    Integer.parseInt(splitLine[6]));
                processorTree.insert(processor);
            }
        }
        System.out.println(processorTree);
    }
}
