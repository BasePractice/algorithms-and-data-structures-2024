package ru.mirea.practice.s23k0155.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class WordChain {

    public static String getLine(String fileName) throws IOException {
        StringBuilder lineBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line == null) {
                return ""; // Файл пуст
            }
            String[] words = line.split(" ");
            if (words.length < 2) {
                return line; // Меньше 2 слов
            }

            boolean[] used = new boolean[words.length]; // массив для отслеживания использованных слов

            // Находим начальное слово
            int startWordIndex = 0;
            for (int i = 1; i < words.length; i++) {
                if (Character.toLowerCase(words[i].charAt(0))
                        == Character.toLowerCase(words[0].charAt(words[0].length() - 1))) {
                    startWordIndex = i;
                    break;
                }
            }

            // Строим цепочку
            int currentWordIndex = startWordIndex;
            lineBuilder.append(words[currentWordIndex]).append(" ");
            used[currentWordIndex] = true;
            while (lineBuilder.length() < line.length()) {
                for (int i = 0; i < words.length; i++) {
                    if (!used[i] && Character.toLowerCase(words[i].charAt(0))
                            == Character.toLowerCase(words[currentWordIndex].charAt(words[currentWordIndex].length() - 1))) {
                        currentWordIndex = i;
                        lineBuilder.append(words[currentWordIndex]).append(" ");
                        used[currentWordIndex] = true;
                        break;
                    }
                }
            }
        }
        return lineBuilder.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя файла: ");
            String fileName = scanner.nextLine();
            String resultLine = getLine(fileName);
            System.out.println("Результат: " + resultLine);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
