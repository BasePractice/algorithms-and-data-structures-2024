package ru.mirea.practice.s00000028.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public final class SetConverter {

    private SetConverter() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Mango");
        hashSet.add("Orange");

        Set<String> treeSet = convertToTreeSet(hashSet);

        System.out.println("TreeSet: " + treeSet);
    }

    public static Set<String> convertToTreeSet(Set<String> hashSet) {
        return new TreeSet<>(hashSet);
    }
}
