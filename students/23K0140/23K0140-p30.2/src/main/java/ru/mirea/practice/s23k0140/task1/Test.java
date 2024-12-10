package ru.mirea.practice.s23k0140.task1;

public abstract class Test {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] nodes = {10, 8, 12, 4, 6, 5, 7, 13, 3, 9};
        for (int node : nodes) {
            tree.insert(node);
        }

        System.out.println("Содержимое дерева:");
        tree.printInOrder();
        System.out.println();

        System.out.println("\nУдаление узла 8:");
        tree.delete(8);

        System.out.println("Содержимое дерева после удаления:");
        tree.printInOrder();
        System.out.println();

        System.out.println("\nУдаление дерева:");
        tree.destroy();

        System.out.println("Содержимое дерева после полного удаления:");
        tree.printInOrder();
        System.out.println();
    }
}