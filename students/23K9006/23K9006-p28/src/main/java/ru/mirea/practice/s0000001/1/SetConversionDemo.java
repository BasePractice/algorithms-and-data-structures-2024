package ru.mirea.practice.s0000001;

import java.util.HashSet;
import java.util.TreeSet;

abstract class SetConversionDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(25);
        hashSet.add(10);
        hashSet.add(5);
        hashSet.add(20);
        hashSet.add(15);

        System.out.println("Original HashSet:");
        System.out.println(hashSet);

        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println("\nConverted TreeSet:");
        System.out.println(treeSet);
    }
}
