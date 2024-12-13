package ru.mirea.practice.s0000001;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Tree {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("banana");
        hashSet.add("apple");
        hashSet.add("orange");
        hashSet.add("grape");
        hashSet.add("kiwi");


        System.out.println("HashSet: " + hashSet);


        TreeSet<String> treeSet = new TreeSet<>(hashSet);


        System.out.println("TreeSet: " + treeSet);
    }
}
