package ru.mirea.practice.s23k0690;

public final class Task1 {

    static class TreeNode {
        int value;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int value) {
            this.value = value;
            leftChild = rightChild = null;
        }
    }

    private TreeNode rootNode;

    public Task1() {
        rootNode = null;
    }

    public void addNode(int value) {
        rootNode = addNodeRecursively(rootNode, value);
    }

    private TreeNode addNodeRecursively(TreeNode rootNode, int value) {
        if (rootNode == null) {
            rootNode = new TreeNode(value);
            return rootNode;
        }

        if (value < rootNode.value) {
            rootNode.leftChild = addNodeRecursively(rootNode.leftChild, value);
        } else if (value > rootNode.value) {
            rootNode.rightChild = addNodeRecursively(rootNode.rightChild, value);
        }

        return rootNode;
    }

    public boolean contains(int value) {
        return containsRecursively(rootNode, value);
    }

    private boolean containsRecursively(TreeNode rootNode, int value) {
        if (rootNode == null) {
            return false;
        }
        if (value == rootNode.value) {
            return true;
        }
        if (value < rootNode.value) {
            return containsRecursively(rootNode.leftChild, value);
        } else {
            return containsRecursively(rootNode.rightChild, value);
        }
    }

    public void removeNode(int value) {
        rootNode = removeNodeRecursively(rootNode, value);
    }

    private TreeNode removeNodeRecursively(TreeNode rootNode, int value) {
        if (rootNode == null) {
            return rootNode;
        }

        if (value < rootNode.value) {
            rootNode.leftChild = removeNodeRecursively(rootNode.leftChild, value);
        } else if (value > rootNode.value) {
            rootNode.rightChild = removeNodeRecursively(rootNode.rightChild, value);
        } else {
            if (rootNode.leftChild == null) {
                return rootNode.rightChild;
            } else if (rootNode.rightChild == null) {
                return rootNode.leftChild;
            }

            rootNode.value = findMinValue(rootNode.rightChild);
            rootNode.rightChild = removeNodeRecursively(rootNode.rightChild, rootNode.value);
        }

        return rootNode;
    }

    private int findMinValue(TreeNode rootNode) {
        int minValue = rootNode.value;
        while (rootNode.leftChild != null) {
            rootNode = rootNode.leftChild;
            minValue = rootNode.value;
        }
        return minValue;
    }

    public void printInOrder() {
        printInOrderRecursively(rootNode);
    }

    private void printInOrderRecursively(TreeNode rootNode) {
        if (rootNode != null) {
            printInOrderRecursively(rootNode.leftChild);
            System.out.print(rootNode.value + " ");
            printInOrderRecursively(rootNode.rightChild);
        }
    }

    public static void main(String[] args) {
        Task1 tree = new Task1();
        tree.addNode(10);
        tree.addNode(20);
        tree.addNode(30);
        tree.addNode(40);
        tree.addNode(50);
        tree.addNode(60);
        tree.addNode(70);
        tree.addNode(80);
        tree.addNode(90);
        tree.addNode(100);
        System.out.println("В порядке возрастания:");
        tree.printInOrder();
        System.out.println("\nЕсть ли 10?: " + tree.contains(10));
        System.out.println("Есть ли 0?: " + tree.contains(0));
        tree.removeNode(100);
        System.out.println("После удаления 100:");
        tree.printInOrder();
    }
}
