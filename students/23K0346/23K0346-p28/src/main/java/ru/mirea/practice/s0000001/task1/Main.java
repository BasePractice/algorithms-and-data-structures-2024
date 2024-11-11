package ru.mirea.practice.s0000001.task1;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("яблоко");
        hashSet.add("апельсин");
        hashSet.add("банан");
        hashSet.add("виноград");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("Элементы TreeSet (упорядочены):");
        for (String item : treeSet) {
            System.out.println(item);
        }
    }
}

