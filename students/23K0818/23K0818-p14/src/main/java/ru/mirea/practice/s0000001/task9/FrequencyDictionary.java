package ru.mirea.practice.s0000001.task9;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public abstract class FrequencyDictionary {

    public static void main(String[] args) {
        String text = "Съешь ещё этих мягких французских булок, да выпей же чаю.";

        // Получаем частотный словарь
        Map<Character, Integer> frequencyMap = buildFrequencyDictionary(text);

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Буква: " + entry.getKey() + ", Частота: " + entry.getValue());
        }
    }

    public static Map<Character, Integer> buildFrequencyDictionary(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Приводим текст к нижнему регистру с использованием Locale и удаляем все символы, кроме букв
        text = text.toLowerCase(Locale.getDefault()).replaceAll("[^а-я]", "");

        // Подсчитываем частоту каждой буквы
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        return frequencyMap;
    }
}
