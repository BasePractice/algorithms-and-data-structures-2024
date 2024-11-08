package ru.mirea.practice.s0000001.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class WordChain {

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса
    private WordChain() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        String fileName = System.console().readLine("Введите имя файла: ");

        try {
            List<String> words = readWordsFromFile(fileName);

            String result = getLine(words);

            System.out.println(result);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                for (String part : parts) {
                    words.add(part.trim());
                }
            }
        }
        return words;
    }

    public static String getLine(List<String> words) {
        if (words == null || words.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        Set<String> usedWords = new HashSet<>();

        // Начинаем с первого слова
        String currentWord = words.get(0);
        result.append(currentWord);
        usedWords.add(currentWord);

        while (usedWords.size() < words.size()) {
            boolean foundNextWord = false;
            for (String word : words) {
                if (!usedWords.contains(word)
                    && currentWord.toLowerCase(Locale.ROOT).charAt(currentWord.length() - 1)
                    == word.toLowerCase(Locale.ROOT).charAt(0)) {
                    result.append(" ").append(word);
                    usedWords.add(word);
                    currentWord = word;
                    foundNextWord = true;
                    break;
                }
            }
            if (!foundNextWord) {
                break; // Если не нашли подходящего слова, выходим из цикла
            }
        }

        return result.toString();
    }
}
