package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TwoThreeTree {
    private static class Node {
        private final boolean isLeaf;
        private final List<ProcessorRecord> records = new ArrayList<>();
        private final List<Node> children = new ArrayList<>();

        Node(boolean isLeaf) {
            this.isLeaf = isLeaf;
        }
    }

    private Node root = new Node(true);

    public void insert(ProcessorRecord record) {
        root = insertRec(root, record);
    }

    private Node insertRec(Node node, ProcessorRecord record) {
        if (node.isLeaf) {
            node.records.add(record);
            node.records.sort(Comparator.comparingInt(ProcessorRecord::getKey));
            if (node.records.size() > 2) {
                return split(node);
            }
            return node;
        } else {
            if (record.getKey() < node.records.get(0).getKey()) {
                Node newChild = insertRec(node.children.get(0), record);
                if (newChild != node.children.get(0)) {
                    node.children.add(0, newChild);
                }
            } else if (node.records.size() == 1 || record.getKey() < node.records.get(1).getKey()) {
                Node newChild = insertRec(node.children.get(1), record);
                if (newChild != node.children.get(1)) {
                    node.children.add(1, newChild);
                }
            } else {
                Node newChild = insertRec(node.children.get(2), record);
                if (newChild != node.children.get(2)) {
                    node.children.add(2, newChild);
                }
            }
            if (node.children.size() > 3) {
                return split(node);
            }
            return node;
        }
    }

    private Node split(Node node) {
        Node left = new Node(node.isLeaf);
        Node right = new Node(node.isLeaf);
        left.records.add(node.records.get(0));
        right.records.add(node.records.get(2));
        if (!node.isLeaf) {
            left.children.add(node.children.get(0));
            left.children.add(node.children.get(1));
            right.children.add(node.children.get(2));
            right.children.add(node.children.get(3));
        }
        Node parent = new Node(false);
        parent.records.add(node.records.get(1));
        parent.children.add(left);
        parent.children.add(right);
        return parent;
    }

    public boolean delete(int key) {
        return deleteRec(root, key);
    }

    private boolean deleteRec(Node node, int key) {
        if (node.isLeaf) {
            return node.records.removeIf(r -> r.getKey() == key);
        } else {
            for (int i = 0; i < node.records.size(); i++) {
                if (key < node.records.get(i).getKey()) {
                    return deleteRec(node.children.get(i), key);
                }
            }
            return deleteRec(node.children.get(node.children.size() - 1), key);
        }
    }

    public void printByLevels() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.isLeaf) {
                for (ProcessorRecord record : current.records) {
                    System.out.print(record.getKey() + " ");
                }
            } else {
                for (ProcessorRecord record : current.records) {
                    System.out.print(record.getKey() + "- ");
                }
                queue.addAll(current.children);
            }
            System.out.println();
        }
    }

    public List<ProcessorRecord> getAllRecords() {
        List<ProcessorRecord> result = new ArrayList<>();
        getAllRecordsRec(root, result);
        return result;
    }

    private void getAllRecordsRec(Node node, List<ProcessorRecord> result) {
        if (node.isLeaf) {
            result.addAll(node.records);
        } else {
            for (int i = 0; i < node.records.size(); i++) {
                getAllRecordsRec(node.children.get(i), result);
            }
            getAllRecordsRec(node.children.get(node.children.size() - 1), result);
        }
    }
}
