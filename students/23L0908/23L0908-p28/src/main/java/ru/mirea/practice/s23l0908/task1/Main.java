package ru.mirea.practice.s23l0908.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public final class Main {

    private Main() {
    }

    public static <T> Set<T> convertToTreeSet(Set<T> hashSet) {
        return new TreeSet<>(hashSet);
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("CAR");
        hashSet.add("HOUSE");
        hashSet.add("COMPUTER");

        Set<String> treeSet = convertToTreeSet(hashSet);
        System.out.println(treeSet);
    }
}

