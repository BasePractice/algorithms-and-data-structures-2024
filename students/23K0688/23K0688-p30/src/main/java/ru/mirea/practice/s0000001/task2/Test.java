package ru.mirea.practice.s0000001.task2;

public abstract class Test {
    public static void main(String[] args) {
        String str = "sand";
        char[] chars = {'s', 'a', 'n', 'd'};
        int[] freqs = {1, 1, 1, 1};
        Algae alg = new Algae();
        Algae.Node root = Algae.tree(chars, freqs);
        alg.hasher(root, "");
        String str1 = alg.hash(str);
        System.out.println("start: " + str);
        System.out.println("encoded: " + str1);
    }
}
