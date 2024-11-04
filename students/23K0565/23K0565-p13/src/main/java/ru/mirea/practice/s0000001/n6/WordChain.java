package ru.mirea.practice.s0000001.n6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public final class WordChain {

    private WordChain() {}

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fileName;
        try {
            System.out.println("Введите имя файла:");
            fileName = console.nextLine();
        } finally {
            console.close();
        }

        List<String> words = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                words.add(fileScanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("К сожалению, данный файл не найден: " + fileName);
            return;
        }

        String result = getLine(words);
        System.out.println(result);
    }

    public static String getLine(List<String> words) {
        if (words.isEmpty()) {
            return "";
        }

        StringBuilder chain = new StringBuilder(words.remove(0));

        boolean found;
        do {
            found = false;
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                if (chain.charAt(chain.length() - 1) == word.toLowerCase(Locale.ROOT).charAt(0)) {
                    chain.append(" ").append(word);
                    words.remove(i);
                    found = true;
                    break;
                } else if (chain.charAt(0) == word.toLowerCase(Locale.ROOT).charAt(word.length() - 1)) {
                    chain.insert(0, word + " ");
                    words.remove(i);
                    found = true;
                    break;
                }
            }
        } while (found);

        return chain.toString();
    }
}
