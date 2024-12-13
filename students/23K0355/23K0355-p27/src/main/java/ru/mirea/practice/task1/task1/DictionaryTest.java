package ru.mirea.practice.task1.task1;

import java.util.HashMap;
import java.util.Map;

public abstract class DictionaryTest {

    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("apple", "Фрукт.");
        dictionary.put("banana", "Длинный изогнутый фрукт.");
        dictionary.put("cat", "Маленькое млекопитающее с шерстью.");
        dictionary.put("dog", "млекопитающее, часто содержащиеся как домашний питомец.");
        dictionary.put("elephant", "Большое млекопитающее с хоботом.");
        dictionary.put("flower", "растения.");
        dictionary.put("guitar", "Музыкальный инструмент с шестью струнами.");
        dictionary.put("house", "Здание для проживания людей.");
        dictionary.put("ice", "Замерзшая вода");
        dictionary.put("jungle", "Местность, покрытая густым лесом");

        System.out.println("Словарь:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

