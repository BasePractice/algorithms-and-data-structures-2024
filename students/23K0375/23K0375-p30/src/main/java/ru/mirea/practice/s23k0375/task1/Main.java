package ru.mirea.practice.s23k0375.task1;

public abstract class Main {
    public static void main(String[] args) {
        BinSearchTree bst = new BinSearchTree();


        int[] values = {50, 40, 30, 20, 10, 60, 70, 80, 90, 5};
        for (int value : values) {
            bst.insert(value);
        }


        System.out.println("Содержимое дерева (инфиксный обход):");
        bst.inorder();
        System.out.println();


        bst.delete(20);
        System.out.println("Содержимое дерева после удаления узла со значением 20:");
        bst.inorder();
        System.out.println();


        bst.root = null;
        System.out.println("Дерево полностью удалено.");
    }
}
