package ru.mirea.practice.s23k0368;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        hashset.add(0);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        hashset.add(3);

        System.out.println("Объект HashSet: " + hashset);

        TreeSet<Integer> treeSet = new TreeSet<>(hashset);

        System.out.println("Объект TreeSet: " + treeSet);
    }
}
