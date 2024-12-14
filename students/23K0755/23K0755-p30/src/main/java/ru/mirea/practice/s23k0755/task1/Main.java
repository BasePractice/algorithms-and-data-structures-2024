package ru.mirea.practice.s23k0755.task1;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        System.out.print("In-Order Traversal: ");
        tree.printInOrder();

        int height = tree.height();
        System.out.println("Height of the tree: " + height);

        int maxWidth = tree.getMaxWidth();
        System.out.println("Maximum width of the tree: " + maxWidth);

        int searchValue1 = 7;
        int searchValue2 = 20;
        System.out.println("Lookup " + searchValue1 + ": " + tree.lookup(searchValue1));
        System.out.println("Lookup " + searchValue2 + ": " + tree.lookup(searchValue2));

        tree.reverse();
        System.out.print("In-Order Traversal after reversing: ");
        tree.printInOrder();

        BinaryTree tree2 = new BinaryTree();
        tree2.insert(10);
        tree2.insert(5);
        tree2.insert(15);
        tree2.insert(3);
        tree2.insert(7);
        tree2.insert(12);
        tree2.insert(18);

        boolean areSame = tree.sameTree(tree.root, tree2.root);
        System.out.println("Are the two trees the same? " + areSame);

        tree2.insert(20);
        areSame = tree.sameTree(tree.root, tree2.root);
        System.out.println("Are the two trees the same after modification? " + areSame);
    }
}
