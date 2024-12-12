package ru.mirea.practice.lab31.t1;

import java.util.Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.List;

public class Tree23 {
    private final Node root = new Node(true);

    public Node getRoot() {
        return root;
    }

    public Node insert(Node node, int key) {
        if (node.isLeaf) {
            node.key.add(key);
            Collections.sort(node.key);
            if (node.key.size() > 3) {
                return split(node);
            }
        } else {
            if (key < node.key.get(0)) {
                node.child.set(0, insert(node.child.get(0), key));
            } else if (node.key.size() == 1 || key < node.key.get(1)) {
                node.child.set(1, insert(node.child.get(1), key));
            } else {
                node.child.set(2, insert(node.child.get(2), key));
            }
        }
        return node;
    }

    public Node split(Node node) {
        Node left = new Node(node.isLeaf);
        Node right = new Node(node.isLeaf);

        left.key.add(node.key.get(0));
        right.key.add(node.key.get(2));

        if (!node.isLeaf) {
            left.child.add(node.child.get(0));
            left.child.add(node.child.get(1));
            right.child.add(node.child.get(2));
            right.child.add(node.child.get(3));
        }

        Node parent = new Node(false);
        parent.key.add(node.key.get(1));
        parent.child.add(left);
        parent.child.add(right);

        return parent;
    }

    public boolean delete(Node node, int key) {
        if (node == null) {
            return false;
        }

        if (node.key.contains(key)) {
            node.key.remove((Integer) key);
            return true;
        } else if (!node.isLeaf) {
            if (key < node.key.get(0)) {
                return delete(node.child.getFirst(), key);
            } else if (node.key.size() == 1 || key < node.key.get(1)) {
                return delete(node.child.get(1), key);
            } else {
                return delete(node.child.get(2), key);
            }
        }
        return false;
    }

    public boolean contains(Node node, int key) {
        if (node == null) {
            return false;
        }
        if (node.key.contains(key)) {
            return true;
        }
        if (node.isLeaf) {
            return false;
        }

        if (key < node.key.get(0)) {
            return contains(node.child.getFirst(), key);
        } else if (node.key.size() == 1 || key < node.key.get(1)) {
            return contains(node.child.get(1), key);
        } else {
            return contains(node.child.get(2), key);
        }
    }

    public void printLvl() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Stack<List<String>> lvl = new Stack<>();

        while (!q.isEmpty()) {
            int size = q.size();
            List<String> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                assert cur != null;
                if (cur.isLeaf) {
                    level.addAll(cur.key.stream().map(Object::toString).collect(Collectors.toList()));
                } else {
                    level.add(cur.key.toString());
                    q.addAll(cur.child);
                }
            }
            lvl.push(level);
        }
        while (!lvl.isEmpty()) {
            System.out.println(String.join(", ", lvl.pop()));
        }
    }

    public List<String> getAllRecords(Node node) {
        List<String> records = new ArrayList<>();
        if (node == null) {
            return records;
        }

        if (node.isLeaf) {
            for (int key : node.key) {
                records.add(String.valueOf(key));
            }
        } else {
            for (Node child : node.child) {
                records.addAll(getAllRecords(child));
            }
        }
        return records;
    }
}
