package ru.mirea.practice.s0000001.task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class TwoThreeTree {
    private TreeNode root;

    public void insert(int key) {
        if (root == null) {
            root = new TreeNode(key);
        } else {
            root = insert(root, key);
        }
    }

    private TreeNode insert(TreeNode node, int key) {
        if (node.isLeaf()) {
            node.keys.add(key);
            sortKeys(node);
            if (node.keys.size() == 3) {
                return split(node);
            }
            return null;
        }

        for (int i = 0; i < node.keys.size(); i++) {
            if (key < node.keys.get(i)) {
                TreeNode child = insert(node.children.get(i), key);
                if (child != null) {
                    node.keys.add(i, child.keys.get(0));
                    node.children.add(i + 1, child);
                    if (node.keys.size() == 3) {
                        return split(node);
                    }
                }
                return null;
            }
        }

        TreeNode child = insert(node.children.get(node.children.size() - 1), key);
        if (child != null) {
            node.keys.add(child.keys.get(0));
            node.children.add(child);
            if (node.keys.size() == 3) {
                return split(node);
            }
        }
        return null;
    }

    private TreeNode split(TreeNode node) {
        TreeNode newNode = new TreeNode(node.keys.remove(2));
        newNode.children.addAll(node.children.subList(2, node.children.size()));
        node.children = node.children.subList(0, 2);
        return newNode;
    }

    private void sortKeys(TreeNode node) {
        node.keys.sort(Integer::compareTo);
    }

    public void printTree() {
        if (root != null) {
            printTree(root, 0);
        }
    }

    private void printTree(TreeNode node, int level) {
        System.out.print(" ".repeat(level * 2));
        System.out.print(node.keys + " ");
        for (TreeNode child : node.children) {
            printTree(child, level + 1);
        }
        System.out.println();
    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            saveToFile(root, writer);
        }
    }

    private void saveToFile(TreeNode node, BufferedWriter writer) throws IOException {
        if (node != null) {
            for (int key : node.keys) {
                writer.write(key + ", ");
            }
            writer.newLine();
            for (TreeNode child : node.children) {
                saveToFile(child, writer);
            }
        }
    }
}