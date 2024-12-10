package ru.mirea.practice.s23k0140.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("cherry");
        hashSet.add("apple");
        hashSet.add("orange");
        hashSet.add("banana");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("Элементы TreeSet (упорядочены):");
        for (String item : treeSet) {
            System.out.println(item);
        }
    }
}