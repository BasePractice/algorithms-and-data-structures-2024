package mirea.lab31;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Tree {
    private Node root = new Node(true);

    public Node insert(Node node, int key) {
        if (node.leaf) {
            node.key.add(key);
            Collections.sort(node.key);
            if (node.key.size() > 3) {
                return split(node);
            }
            return node;
        } else {
            if (key < node.key.get(0)) {
                node.child.set(0, insert(node.child.get(0), key));
            } else if (node.key.size() == 1 || key < node.key.get(1)) {
                node.child.set(1, insert(node.child.get(1), key));
            } else {
                node.child.set(2, insert(node.child.get(2), key));
            }
            return node;
        }
    }

    public Node split(Node node) {
        Node left = new Node(node.leaf);
        Node right = new Node(node.leaf);

        left.key.add(node.key.get(0));
        right.key.add(node.key.get(2));

        if (!node.leaf) {
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

    public void printLvl() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Stack<List<String>> lvl = new Stack<>();

        while (!q.isEmpty()) {
            int size = q.size();
            List<String> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node cur = q.poll();
                if (cur.leaf) {
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
}
