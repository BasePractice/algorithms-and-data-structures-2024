package ru.mirea.practice.s0000001;

abstract class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(30);
        tree.add(70);
        tree.add(20);
        tree.add(40);
        tree.add(60);
        tree.add(80);

        System.out.println("In-order traversal:");
        tree.traverseInOrder();

        System.out.println("Tree contains 40: " + tree.contains(40));
        System.out.println("Tree contains 90: " + tree.contains(90));

        System.out.println("Deleting 40...");
        tree.delete(40);
        System.out.println("In-order traversal after deletion:");
        tree.traverseInOrder();
    }
}
