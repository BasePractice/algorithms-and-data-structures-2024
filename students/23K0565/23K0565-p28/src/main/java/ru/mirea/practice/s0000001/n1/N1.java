package ru.mirea.practice.s0000001.n1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public final class N1 {
    private static Set<String> hSet;

    private N1() {
    }

    public static void initSet() {
        hSet = new HashSet<>();
    }

    public static void addToSet(String value) {
        hSet.add(value);
    }

    public static Set<String> convertToTreeSet() {
        return new TreeSet<>(hSet);
    }

    public static void main(String[] args) {
        initSet();

        addToSet("мангоо");
        addToSet("манго");
        addToSet("манго13");
        addToSet("манго14");
        addToSet("манго15");

        System.out.println("HashSet:");
        for (String item : hSet) {
            System.out.println(item);
        }

        Set<String> tSet = convertToTreeSet();

        System.out.println("\nTreeSet (отсортированный):");
        for (String item : tSet) {
            System.out.println(item);
        }
    }
}
