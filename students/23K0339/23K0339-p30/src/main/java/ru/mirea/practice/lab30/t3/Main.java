package ru.mirea.practice.lab30.t3;

public abstract class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {20, 8, 22, 4, 12, 10, 14, 24, 2, 6};
        for (int value : values) {
            tree.insert(value);
        }

        System.out.println("Дерево до удаления узла:");
        tree.printTree();

        tree.delete(12);

        System.out.println("Дерево после удаления узла 12:");
        tree.printTree();

        tree.deleteTree();
        System.out.println("Дерево удалено");
    }
}

