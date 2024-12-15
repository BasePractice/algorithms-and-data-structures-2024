package ru.mirea.practice.s23k0145.lab1;

public abstract class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] elements = {50, 30, 70, 20, 40, 60, 80, 15, 35, 65};
        for (int element : elements) {
            tree.addNode(element);
        }

        System.out.println("Initial tree (in-order traversal):");
        tree.traverseInOrder();
        System.out.println();

        System.out.println("\nRemoving node with value 40:");
        tree.removeNode(40);

        System.out.println("Tree after removing node 40 (in-order traversal):");
        tree.traverseInOrder();
        System.out.println();

        System.out.println("\nClearing the tree:");
        tree.clearTree();

        System.out.println("Tree after clearing (in-order traversal):");
        tree.traverseInOrder();
        System.out.println();
    }
}

