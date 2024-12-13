package ru.mirea.practice.s23k0120.task1;

public class TwoThreeTree<E extends Comparable<E>> {
    // Minimum degree
    private final int t;
    // Pointer to root node
    private TwoThreeTreeNode<E> root;

    public TwoThreeTree() {
        this.t = 2;
        root = null;
    }

    public TwoThreeTreeNode<E> search(E data) {
        return (root == null) ? null : root.search(data);
    }

    // Function to insert a key into the B-tree
    public void insert(E data) {
        if (root == null) {
            root = new TwoThreeTreeNode<E>(true);
            root.dataArr.set(0, data);
            root.numOfKeys = 1;
        } else {
            if (root.numOfKeys == 2 * t - 1) {
                TwoThreeTreeNode<E> newRoot = new TwoThreeTreeNode<E>(false);
                newRoot.children.set(0, root);
                newRoot.splitChild(0, root);

                int i = 0;

                if (data.compareTo(newRoot.dataArr.get(0)) > 0) {
                    i++;
                }

                newRoot.children.get(i).insertNonFull(data);
                root = newRoot;
            } else {
                root.insertNonFull(data);
            }
        }
    }

    // Function to print the entire B-tree
    public void printBTree() {
        if (root != null) {
            root.printInOrder();
        }

        System.out.println();
    }
}
