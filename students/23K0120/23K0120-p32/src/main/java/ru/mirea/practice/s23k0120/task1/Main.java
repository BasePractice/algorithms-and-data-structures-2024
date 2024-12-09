package ru.mirea.practice.s23k0120.task1;

import java.util.List;

public abstract class Main {
    public static String combine(List<Integer> list) {
        StringBuilder s = new StringBuilder();
        for (Integer i : list) {
            s.append(i);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Combinatorics comb = new Combinatorics();
        List<List<Integer>> perms = comb.permutations(4);
        System.out.println(perms);
        System.out.println(perms.size());
    }
}
