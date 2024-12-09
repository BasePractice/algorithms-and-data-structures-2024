package ru.mirea.practice.s23k0164.t1;

import java.util.HashSet;
import java.util.TreeSet;

public final class HashSetToTreeSetExample {
    private HashSetToTreeSetExample() {
    }

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("banana");
        hashSet.add("apple");
        hashSet.add("grape");
        hashSet.add("orange");
        System.out.println("Original HashSet: " + hashSet);
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet (sorted order): " + treeSet);
    }
}
