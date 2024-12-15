package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tree23 {
    static class Node {
        int key1;
        int key2;
        Node left;
        Node mid;
        Node right;
        boolean isLeaf;
        List<String> data;

        Node(int k, String info) {
            key1 = k;
            isLeaf = true;
            data = new ArrayList<>();
            data.add(info);
        }
    }

    Node root;

    public void add(int key, String info) {
        if (root == null) {
            root = new Node(key, info);
        } else {
            Node newRoot = insert(root, key, info);
            if (newRoot != null) {
                root = newRoot;
            }
        }
    }

    private Node insert(Node node, int key, String info) {
        if (node.isLeaf) {
            if (node.data.size() < 2) {
                node.data.add(info);
                if (key < node.key1) {
                    node.key2 = node.key1;
                    node.key1 = key;
                } else {
                    node.key2 = key;
                }
                return null;
            } else {
                return splitLeaf(node, key, info);
            }
        } else {
            Node res;
            if (key < node.key1) {
                res = insert(node.left, key, info);
            } else if (node.key2 == 0 || key < node.key2) {
                res = insert(node.mid, key, info);
            } else {
                res = insert(node.right, key, info);
            }

            if (res != null) {
                return splitInternal(node, res);
            }
        }
        return null;
    }

    private Node splitLeaf(Node node, int key, String info) {
        List<Integer> keys = new ArrayList<>();
        keys.add(node.key1);
        keys.add(node.key2);
        keys.add(key);
        Collections.sort(keys);
        final Node newNode = new Node(keys.get(2), info);
        node.key1 = keys.get(0);
        node.key2 = 0;
        node.data.clear();
        node.data.add("Key: " + keys.get(0));
        return newNode;
    }

    private Node splitInternal(Node parent, Node newChild) {
        Node newRoot = new Node(parent.key2, "");
        newRoot.left = parent;
        newRoot.mid = newChild;
        return newRoot;
    }

    public void print() {
        printTree(root);
        System.out.println();
    }

    private void printTree(Node node) {
        if (node != null) {
            if (node.isLeaf) {
                System.out.print(node.key1 + " ");
                if (node.key2 != 0) {
                    System.out.print(node.key2 + " ");
                }
            } else {
                printTree(node.left);
                System.out.print(node.key1 + " ");
                printTree(node.mid);
                if (node.key2 != 0) {
                    System.out.print(node.key2 + " ");
                    printTree(node.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree23 tree = new Tree23();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите команду (A - добавить, L - вывести, E - выход):");
                String cmd = sc.next();
                if ("A".equals(cmd)) {
                    System.out.println("Введите ключ:");
                    int key = sc.nextInt();
                    System.out.println("Введите информацию:");
                    sc.nextLine();  // Поглощаем перевод строки
                    String info = sc.nextLine();
                    tree.add(key, info);
                } else if ("L".equals(cmd)) {
                    tree.print();
                } else if ("E".equals(cmd)) {
                    break;
                } else {
                    System.out.println("Неизвестная команда:(");
                }
            }
        }
    }
}
