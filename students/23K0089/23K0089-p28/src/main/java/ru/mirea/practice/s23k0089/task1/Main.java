package ru.mirea.practice.s23k0089.task1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(1, 7);
        hashmap.put(2, 11);
        hashmap.put(3, 13);
        hashmap.put(4, 88);
        Map<Integer, Integer> treemap = new TreeMap<>(hashmap);
        System.out.println(hashmap);
        System.out.println(treemap);
    }
}
