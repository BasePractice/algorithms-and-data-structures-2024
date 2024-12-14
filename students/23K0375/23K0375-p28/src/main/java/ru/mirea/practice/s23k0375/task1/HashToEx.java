package ru.mirea.practice.s23k0375.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class HashToEx {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("geeks");
        hashSet.add("practice");
        hashSet.add("contribute");
        hashSet.add("ide");

        System.out.println("HashSet: " + hashSet);

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet: " + treeSet);
    }
}

