package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(6);
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(2);
        tree.add(1);
        System.out.println("4:" + tree.isVal(4));
        System.out.println("40:" + tree.isVal(10));
        tree.sort();
    }
}
