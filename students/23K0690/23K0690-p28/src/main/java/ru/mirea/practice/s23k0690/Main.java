package ru.mirea.practice.s23k0690;

import java.util.HashSet;
import java.util.TreeSet;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Сигарета");
        hashSet.add("Банан");
        hashSet.add("Камень");
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
