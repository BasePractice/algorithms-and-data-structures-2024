package ru.mirea.practice.s0000001;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Task1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("orange");
        hashSet.add("banana");
        hashSet.add("pear");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet: " + treeSet);
    }
}
