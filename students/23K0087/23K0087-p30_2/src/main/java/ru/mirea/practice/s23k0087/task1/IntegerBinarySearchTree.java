package ru.mirea.practice.s23k0087.task1;


public class IntegerBinarySearchTree extends BinarySearchTree<Integer> {
    IntegerBinarySearchTree() {
        super();
    }

    public boolean isBst(Node<Integer> node) {
        return isBstUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBstUtil(Node<Integer> node, int minValue, int maxValue) {
        if (node == null) {
            return true;
        }
        if (node.getData() < minValue || node.getData() > maxValue) {
            return false;
        }
        return isBstUtil(node.getLeft(), minValue, node.getData()) && isBstUtil(node.getRight(), node.getData() + 1, maxValue);
    }

}
