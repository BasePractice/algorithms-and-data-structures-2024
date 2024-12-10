package ru.mirea.practice.s0000001.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public abstract class Converted {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("human");
        hashSet.add("gnome");
        hashSet.add("giant");
        System.out.println("hash:");
        for (String el : hashSet) {
            System.out.println(el);
            System.out.println(el.hashCode());
        }
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("tree:");
        for (String el : treeSet) {
            System.out.println(el);
            System.out.println(el.hashCode());
        }
    }
}
