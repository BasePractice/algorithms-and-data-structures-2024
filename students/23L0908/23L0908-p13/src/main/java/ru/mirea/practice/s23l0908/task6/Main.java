package ru.mirea.practice.s23l0908.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public final class Main {

    private Main() {
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String fileName = "Киев Нью-Йорк Амстердам Вена Мельбурн";
            System.out.println("String: " + fileName);
            String[] arr = fileName.split(" ");
            getLine(0, arr);
        }
    }

    public static void getLine(int q, String... words) {
        if (q == words.length) {
            return;
        }
        StringBuilder result = new StringBuilder();
        List<String> list = new ArrayList<>(Arrays.asList(words));
        result.append(list.get(q)).append(" ");
        String word = list.get(q);
        list.remove(q);
        int max = list.size();
        int count = 0;

        while (!list.isEmpty() && count < max) {
            boolean found = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).toLowerCase(Locale.ROOT).charAt(0) == word.toLowerCase(Locale.ROOT).charAt(word.length() - 1)) {
                    result.append(list.get(i)).append(" ");
                    word = list.get(i);
                    list.remove(i);
                    found = true;
                    break;
                }
            }
            count++;
            if (!found) {
                break;
            }
        }


        for (String text : list) {
            result.append(text).append(" ");
        }
        System.out.println(result);
        getLine(++q, words);
    }
}

