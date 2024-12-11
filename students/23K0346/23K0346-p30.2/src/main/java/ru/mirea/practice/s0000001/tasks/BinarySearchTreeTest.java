package ru.mirea.practice.s0000001.tasks;

public abstract class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] nodes = {20, 8, 22, 4, 12, 10, 14, 25, 3, 7};
        for (int node : nodes) {
            tree.insert(node);
        }

        System.out.println("Содержимое дерева (in-order):");
        tree.printInOrder();
        System.out.println();

        System.out.println("\nУдаление узла 10:");
        tree.delete(10);

        System.out.println("Содержимое дерева (in-order) после удаления:");
        tree.printInOrder();
        System.out.println();

        System.out.println("\nУдаление дерева:");
        tree.destroy();

        System.out.println("Содержимое дерева после полного удаления:");
        tree.printInOrder();
        System.out.println();
    }
}

