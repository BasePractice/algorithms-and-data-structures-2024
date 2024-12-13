package ru.mirea.practice.s23k0087.task1;

public abstract class Tester {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(4);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(10);
        System.out.println("Tree height: " + tree.height(tree.root));
        System.out.println("Tree size: " + tree.size(tree.root));
        System.out.println("Max width of the tree: " + tree.getMaxWidth(tree.root));
        int target1 = 5;
        System.out.println("Looking for " + target1 + "... " + tree.lookup(tree.root, target1));
        int target2 = 2;
        System.out.println("Looking for " + target2 + "... " + tree.lookup(tree.root, target2));
        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(1);
        tree2.root.left = new Node(1);
        tree2.root.right = new Node(1);
        System.out.println("Are those trees the same? " + tree.sameTree(tree.root, tree2.root));
    }
}
