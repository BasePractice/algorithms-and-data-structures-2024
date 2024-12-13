package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TwoThreeTree {
    private class Node {
        boolean isLeaf;
        List<Processor> keys = new ArrayList<>();
        List<Node> children = new ArrayList<>();

        Node(boolean isLeaf) {
            this.isLeaf = isLeaf;
        }
    }

    private Node root = new Node(true);

    public void insert(Processor p) {
        if (root.isLeaf && root.keys.size() < 2) {
            root.keys.add(p);
            root.keys.sort(Comparator.comparingInt(a -> a.key));
        } else {
            Node newRoot = insert(root, p);
            if (newRoot != null) {
                Node oldRoot = root;
                root = new Node(false);
                root.keys.add(newRoot.keys.get(0));
                root.children.add(oldRoot);
                root.children.add(newRoot);
            }
        }
    }

    private Node insert(Node node, Processor p) {
        if (node.isLeaf) {
            node.keys.add(p);
            node.keys.sort(Comparator.comparingInt(a -> a.key));
            if (node.keys.size() > 2) {
                return split(node);
            }
            return null;
        }

        int idx = 0;
        while (idx < node.keys.size() && p.key > node.keys.get(idx).key) {
            idx++;
        }
        Node newChild = insert(node.children.get(idx), p);
        if (newChild != null) {
            node.keys.add(idx, newChild.keys.get(0));
            node.children.add(idx + 1, newChild);
            if (node.keys.size() > 2) {
                return split(node);
            }
        }
        return null;
    }

    private Node split(Node node) {
        Node sibling = new Node(node.isLeaf);
        sibling.keys.add(node.keys.remove(2));
        if (!node.isLeaf) {
            sibling.children.add(node.children.remove(2));
            sibling.children.add(node.children.remove(2));
        }
        return sibling;
    }

    public void delete(int key) {
        // пустота
    }

    public void printTree() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.isLeaf) {
                    for (Processor p : node.keys) {
                        System.out.print(p.key + " ");
                    }
                } else {
                    for (int j = 0; j < node.keys.size(); j++) {
                        System.out.print(node.keys.get(j).key + "-");
                    }
                    for (Node child : node.children) {
                        queue.add(child);
                    }
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<Processor> getAllRecords() {
        List<Processor> records = new ArrayList<>();
        collectRecords(root, records);
        return records;
    }

    private void collectRecords(Node node, List<Processor> records) {
        if (node.isLeaf) {
            records.addAll(node.keys);
        } else {
            for (Node child : node.children) {
                collectRecords(child, records);
            }
        }
    }
}
