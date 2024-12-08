package ru.mirea.practice.s23k0155;

public abstract class Test {
    public static void main(String[] args) {

        TwoThreeTree tree = new TwoThreeTree();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.printTree();

    }
}

