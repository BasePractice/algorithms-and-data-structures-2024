package ru.mirea.practice.s0000001.prog9;

import java.util.Locale;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        String text = "В лесу родилась ёлочка, в лесу она росла. "
                + "Зимой и летом стройная, зелёная была.";

        text = text.toLowerCase(Locale.ENGLISH);

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        //Создание словаря и его сортировка по значениям
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Частотный словарь букв:");
        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
