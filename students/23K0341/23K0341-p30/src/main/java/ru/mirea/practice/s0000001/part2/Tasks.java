package ru.mirea.practice.s0000001;

/**
 * 1 Сначала создать бинарное поисковое действие из 10 узлов, затем
 * содержимое дерева распечатать<br>
 * 2 из него удалить один узел.<br>
 * 3 После этого выполняется еще одна распечатка, чтобы проверить,
 * как прошло удаление<br>
 * 4 дерево удаляется уже полностью с освобождением памяти.
 */

public abstract class Tasks {
    public static void main(String[] args) {
        Tree tree = treeCreate();
        for (int i = 0; i < 10; i++) {
            insert(tree, i);
        }
        walk(tree.root);
        boolean res = delete(tree, 3);
        System.out.println("Deleted?: " + res);
        walk(tree.root);
    }

    static class Node {
        int data;
        Node left;
        Node right;
    }

    static class Tree {
        Node root;
        int count;

        Tree() {
            root = null;
            count = 0;
        }
    }

    static Tree treeCreate() {
        return new Tree();
    }

    static int binSearch(Tree searchTree, int item) {
        Node searchNode;
        searchNode = searchTree.root;
        for (; ; ) {
            if (searchNode == null) {
                return 0;
            } else if (item == searchNode.data) {
                return 1;
            } else if (item > searchNode.data) {
                searchNode = searchNode.right;
            } else {
                searchNode = searchNode.left;
            }
        }
    }

    static void insert(Tree searchTree, int item) {
        Node searchNode = searchTree.root;
        for (; ; ) {
            if (searchNode == null) {
                searchNode = new Node();
                searchNode.data = item;
                searchNode.left = searchNode.right = null;
                searchTree.count++;
                searchTree.root = searchNode;
                return;
            } else if (item == searchNode.data) {
                return;
            } else if (item > searchNode.data) {
                if (searchNode.right != null) {
                    searchNode = searchNode.right;
                } else {
                    Node node = new Node();
                    node.data = item;
                    node.left = node.right = null;
                    searchNode.right = node;
                    searchTree.count++;
                }
            } else {
                if (searchNode.left != null) {
                    searchNode = searchNode.left;
                } else {
                    Node node = new Node();
                    node.data = item;
                    node.left = node.right = null;
                    searchNode.left = node;
                    searchTree.count++;
                }
            }
        }
    }

    static boolean delete(Tree searchTree, int item) {
        Node searchNode;
        searchNode = searchTree.root;
        for (; ; ) {
            if (searchNode == null) {
                return false;
            } else if (item == searchNode.data) {
                break;
            } else if (item > searchNode.data) {
                searchNode = searchNode.right;
            } else {
                searchNode = searchNode.left;
            }
        }

        searchNode = nuke(searchNode);

        return searchNode == null;
    }

    static void walk(Node node) {
        if (node == null) {
            return;
        }

        walk(node.left);
        System.out.println(node.data);
        walk(node.right);
    }

    static Tree nuke(Tree tree) {
        tree = null;
        return null;
    }

    static Node nuke(Node node) {
        node = null;
        return node;
    }
}
