package ru.mirea.practice.s23k0823.task1.task1.task2.part2;

public abstract class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] keys = {50, 30, 20, 40, 70, 60, 80, 10, 90, 5};
        for (int key : keys) {
            bst.insert(key);
        }

        System.out.println("Содержимое дерева:");
        bst.inorder();
        System.out.println();

        System.out.println("Удаление узла с ключом 20:");
        bst.root = bst.deleteNode(bst.root, 20);

        System.out.println("Содержимое дерева после удаления:");
        bst.inorder();
        System.out.println();

        bst.clear();
        System.out.println("Дерево очищено.");
    }
}