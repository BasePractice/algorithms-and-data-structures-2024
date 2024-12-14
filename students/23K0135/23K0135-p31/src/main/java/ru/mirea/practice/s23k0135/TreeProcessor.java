package ru.mirea.practice.s23k0135;

public class TreeProcessor {
    private Node rootNode;

    public void insert(int value) {
        rootNode = insertRecursively(rootNode, value);
    }

    private Node insertRecursively(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.leftChild = insertRecursively(node.leftChild, value);
        } else if (value > node.value) {
            node.rightChild = insertRecursively(node.rightChild, value);
        } else {
            System.out.println("Значение " + value + " уже существует.");
        }
        return node;
    }

    public void remove(int value) {
        rootNode = removeRecursively(rootNode, value);
    }

    private Node removeRecursively(Node node, int value) {
        if (node == null) {
            System.out.println("Значение " + value + " не найдено.");
            return null;
        }
        if (value < node.value) {
            node.leftChild = removeRecursively(node.leftChild, value);
        } else if (value > node.value) {
            node.rightChild = removeRecursively(node.rightChild, value);
        } else {
            if (node.leftChild == null && node.rightChild == null) {
                return null;
            } else if (node.leftChild == null) {
                return node.rightChild;
            } else if (node.rightChild == null) {
                return node.leftChild;
            } else {
                Node smallestNode = findMinValue(node.rightChild);
                node.value = smallestNode.value;
                node.rightChild = removeRecursively(node.rightChild, smallestNode.value);
            }
        }
        return node;
    }

    private Node findMinValue(Node node) {
        return node.leftChild == null ? node : findMinValue(node.leftChild);
    }

    public void printMethod1() {
        if (rootNode == null) {
            System.out.println("Дерево пусто.");
            return;
        }
        int depth = calculateHeight(rootNode);
        for (int level = depth; level >= 1; level--) {
            printLevelNodes(rootNode, level);
        }
        System.out.println();
    }

    public void printMethod2() {
        if (rootNode == null) {
            System.out.println("Дерево пусто.");
            return;
        }
        int depth = calculateHeight(rootNode);
        for (int level = 1; level <= depth; level++) {
            printLevelNodes(rootNode, level);
        }
        System.out.println();
    }

    public void printMethod3() {
        printInOrderRecursive(rootNode);
        System.out.println();
    }

    private void printInOrderRecursive(Node node) {
        if (node != null) {
            printInOrderRecursive(node.leftChild);
            System.out.print(node.value + " ");
            printInOrderRecursive(node.rightChild);
        }
    }

    public void printMethod6() {
        if (rootNode == null) {
            System.out.println("Дерево пусто.");
            return;
        }
        int depth = calculateHeight(rootNode);
        for (int level = 1; level <= depth; level++) {
            System.out.print("Уровень " + level + ": ");
            printLevelNodes(rootNode, level);
            System.out.println();
        }
    }

    private int calculateHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(calculateHeight(node.leftChild), calculateHeight(node.rightChild)) + 1;
    }

    private void printLevelNodes(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.value + " ");
        } else if (level > 1) {
            printLevelNodes(node.leftChild, level - 1);
            printLevelNodes(node.rightChild, level - 1);
        }
    }
}
