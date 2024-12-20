package ru.mirea.practice.s23k0087;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class Task1 {
    public static void main(String[] args) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(20, 31);
        hashmap.put(23, 32);
        hashmap.put(9, 92);
        hashmap.put(13, 22);
        Map<Integer, Integer> treemap = new TreeMap<>(hashmap);
        System.out.println(hashmap);
        System.out.println(treemap);
    }
}

