package ru.mirea.practice.s23k0135;

public abstract class Test {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] nodes = {10, 20, 5, 6, 3, 30, 25, 15, 8, 18};
        for (int node : nodes) {
            tree.insert(node);
        }

        System.out.println("Дерево после вставки узлов:");
        tree.inorder();
        System.out.println();

        System.out.println("Удаляем узел 20:");
        tree.delete(20);
        tree.inorder();
        System.out.println();

        System.out.println("Удаляем все узлы:");
        tree.clear();
        tree.inorder();
        System.out.println();
    }
}
