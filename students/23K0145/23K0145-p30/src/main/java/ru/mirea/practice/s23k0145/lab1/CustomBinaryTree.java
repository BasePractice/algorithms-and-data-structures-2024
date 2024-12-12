package ru.mirea.practice.s23k0145.lab1;

class CustomBinaryTree {
    Node rootNode;

    public int calculateHeight(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }
        int leftSubtreeHeight = calculateHeight(currentNode.leftChild);
        int rightSubtreeHeight = calculateHeight(currentNode.rightChild);
        return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
    }

    public void invertTree(Node currentNode) {
        if (currentNode == null) {
            return;
        }
        Node tempNode = currentNode.leftChild;
        currentNode.leftChild = currentNode.rightChild;
        currentNode.rightChild = tempNode;

        invertTree(currentNode.leftChild);
        invertTree(currentNode.rightChild);
    }

    public boolean searchValue(Node currentNode, int targetValue) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.value == targetValue) {
            return true;
        }
        return targetValue < currentNode.value
                ? searchValue(currentNode.leftChild, targetValue)
                : searchValue(currentNode.rightChild, targetValue);
    }

    public int calculateSize(Node currentNode) {
        if (currentNode == null) {
            return 0;
        }
        return calculateSize(currentNode.leftChild) + 1 + calculateSize(currentNode.rightChild);
    }

    public boolean areTreesIdentical(Node treeOne, Node treeTwo) {
        if (treeOne == null && treeTwo == null) {
            return true;
        }
        if (treeOne == null || treeTwo == null) {
            return false;
        }
        return treeOne.value == treeTwo.value
                && areTreesIdentical(treeOne.leftChild, treeTwo.leftChild)
                && areTreesIdentical(treeOne.rightChild, treeTwo.rightChild);
    }
}
