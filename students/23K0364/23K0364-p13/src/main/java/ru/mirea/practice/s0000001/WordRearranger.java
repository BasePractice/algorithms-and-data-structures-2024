package ru.mirea.practice.s0000001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public abstract class WordRearranger {

    public static String getLine(String line) {
        StringBuilder result = new StringBuilder();
        String[] words = line.split(" ");
        Map<Character, String> map = new HashMap<>();

        for (String word : words) {
            map.putIfAbsent(Character.toLowerCase(word.charAt(word.length() - 1)), word);
        }

        for (Map.Entry<Character, String> entry : map.entrySet()) {
            result.append(entry.getValue()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter a sentence:");
            String line = reader.readLine();

            System.out.println("Rearranged sentence: ");
            System.out.println(getLine(line));
        }
    }
}
