package ru.mirea.practice.s0000001.num1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String f = br.readLine();
        List<String> w = new ArrayList<>();
        try (BufferedReader fr = new BufferedReader(new FileReader(f))) {
            String l;
            while ((l = fr.readLine()) != null) {
                Collections.addAll(w, l.split("\\s+"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close(); // Явное закрытие BufferedReader
        }
        System.out.println(mergeWords(w));
    }

    public static String mergeWords(List<String> w) {
        StringBuilder res = new StringBuilder();
        Set<String> u = new HashSet<>();
        String cur = w.get(0);
        u.add(cur);
        res.append(cur);
        while (u.size() < w.size()) {
            for (String word : w) {
                if (!u.contains(word)
                    && Character.toLowerCase(cur.charAt(cur.length() - 1))
                    == Character.toLowerCase(word.charAt(0))) {
                    u.add(word);
                    res.append(" ").append(word);
                    cur = word;
                    break;
                }
            }
        }
        return res.toString();
    }
}
