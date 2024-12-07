package ru.mirea.practice.s23k0169.t1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Банан");
        hashSet.add("Яблоко");
        hashSet.add("Апельсин");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("Элементы TreeSet: " + treeSet);
    }
}
