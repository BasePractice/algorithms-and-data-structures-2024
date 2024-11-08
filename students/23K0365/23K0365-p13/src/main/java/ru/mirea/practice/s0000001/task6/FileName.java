package ru.mirea.practice.s0000001.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public abstract class FileName {
    public static String getLine(List<String> words) {
        StringBuilder res = new StringBuilder();
        if (words.isEmpty()) {
            return res.toString();
        }
        boolean[] temp = new boolean[words.size()];
        res.append(words.get(0));
        temp[0] = true;
        for (int i = 0; i < words.size();) {
            boolean flag = false;
            for (int j = 1; j < words.size();) {
                if (!temp[j] && res.toString().toLowerCase(Locale.ENGLISH).charAt(res.length() - 1)
                    == words.get(j).toLowerCase(Locale.ENGLISH).charAt(0)) {
                    res.append(" ").append(words.get(j));
                    temp[j] = true;
                    flag = true;
                    break;
                }
                j++;
            }
            if (!flag) {
                break;
            }
            i++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("enter way to file");
            return;
        }
        String filePath = args[0];
        try {
            List<String> words = Files.readAllLines(Paths.get(filePath));
            String[] wordArr = String.join(" ", words).split(" ");
            List<String> wordList = new ArrayList<>(Arrays.asList(wordArr));

            String res = getLine(wordList);
            System.out.println("res:\t" + res);
        } catch (IOException e) {
            System.err.println("fail\t" + e.getMessage());
        }
    }
}
