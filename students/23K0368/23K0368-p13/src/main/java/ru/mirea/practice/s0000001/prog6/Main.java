package ru.mirea.practice.s0000001.prog6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static StringBuilder getLine(List<String> words) {
        if (words == null || words.isEmpty()) {
            return new StringBuilder();
        }

        // Попробуем переставить слова в нужный порядок
        List<String> result = new ArrayList<>(words);
        boolean wordPlaced;

        // Пытаемся найти правильную цепочку слов
        do {
            wordPlaced = false;
            for (int i = 0; i < result.size() - 1; i++) {
                String word1 = result.get(i);
                String word2 = result.get(i + 1);

                // Сравниваем последнюю букву первого слова и первую букву второго слова, игнорируя регистр
                if (Character.toLowerCase(word1.charAt(word1.length() - 1)) == Character.toLowerCase(word2.charAt(0))) {
                    continue; // Все в порядке, слова подходят
                }

                // Ищем слово, которое подходит к текущему
                for (int j = i + 1; j < result.size(); j++) {
                    String candidate = result.get(j);
                    if (Character.toLowerCase(word1.charAt(word1.length() - 1)) == Character.toLowerCase(candidate.charAt(0))) {
                        // Меняем местами слова
                        result.set(i + 1, candidate);
                        result.set(j, word2);
                        wordPlaced = true;
                        break;
                    }
                }
            }
        } while (wordPlaced); // Продолжаем, пока есть изменения

        // Составляем итоговую строку
        StringBuilder finalResult = new StringBuilder();
        for (String word : result) {
            finalResult.append(word).append(" ");
        }

        return finalResult.deleteCharAt(finalResult.length() - 1); // Убираем последний пробел
    }

    public static void main(String[] args) {
        // Считаем с консоли имя файла
        System.out.println("Введите имя файла:");
        try (BufferedReader consoleReader = new BufferedReader(new java.io.InputStreamReader(System.in))) {
            String fileName = consoleReader.readLine();

            // Читаем слова из файла
            List<String> words = new ArrayList<>();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    // Разбиваем строку на слова и добавляем их в список
                    String[] wordArray = line.split("\\s+");
                    for (String word : wordArray) {
                        if (!word.isEmpty()) {
                            words.add(word);
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Ошибка чтения файла: " + e.getMessage());
                return;
            }

            // Получаем результат расстановки слов и выводим его
            StringBuilder result = getLine(words);
            System.out.println("Результат:");
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Ошибка чтения ввода: " + e.getMessage());
        }
    }
}
