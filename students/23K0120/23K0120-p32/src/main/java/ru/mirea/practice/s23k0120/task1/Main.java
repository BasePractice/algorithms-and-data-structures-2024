package ru.mirea.practice.s23k0120.task1;

import java.util.List;
import java.util.stream.Collectors;

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
        List<List<Integer>> perms = comb.permutations(5);
        System.out.println(perms.stream().map(Main::combine).collect(Collectors.toList()));
        System.out.println(perms.size());
    }
}
