package ru.mirea.practice.s23k0623;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void add(Processor processor) {
        root = insert(root, processor);
    }

    private Node insert(Node node, Processor processor) {
        if (node == null) {
            Node newNode = new Node();
            newNode.procs[0] = processor;
            newNode.cnt = 1;
            return newNode;
        }
        if (node.cnt < 3) {
            insertInNode(node, processor);
            return node;
        }
        return splitter(node, processor);
    }

    private void insertInNode(Node node, Processor processor) {
        int i = node.cnt - 1;
        while (i >= 0 && processor.key < node.procs[i].key) {
            node.procs[i + 1] = node.procs[i];
            i--;
        }
        node.procs[i + 1] = processor;
        node.cnt++;
    }

    private Node splitter(Node node, Processor processor) {
        Node newNode = new Node();
        final Processor mid = node.procs[1];
        newNode.procs[0] = node.procs[2];
        newNode.cnt = 1;
        node.cnt = 1;
        node.procs[1] = null;
        if (processor.key < mid.key) {
            insertInNode(node, processor);
        } else {
            insertInNode(newNode, processor);
        }
        Node newRoot = new Node();
        newRoot.procs[0] = mid;
        newRoot.nodes[0] = node;
        newRoot.nodes[1] = newNode;
        newRoot.cnt = 1;
        return newRoot;
    }

    public Processor search(int key) {
        return search(root, key);
    }

    private Processor search(Node node, int key) {
        if (node == null) {
            return null;
        }
        for (int i = 0; i < node.cnt; i++) {
            if (key == node.procs[i].key) {
                return node.procs[i];
            }
            if (key < node.procs[i].key) {
                return search(node.nodes[i], key);
            }
        }
        return search(node.nodes[node.cnt], key);
    }

    public void delete(int key) {
        if (search(key) == null) {
            System.out.println("key not found.");
            return;
        }
        root = delete(root);
    }

    private Node delete(Node node) {
        return node;
    }

    public void saveToFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            saveToFile(root, bw);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    private void saveToFile(Node node, BufferedWriter bw) throws IOException {
        if (node != null) {
            for (int i = 0; i < node.cnt; i++) {
                String str1 = node.procs[i].key + "," + node.procs[i].name + "," + node.procs[i].clockFrequency;
                String str2 = "," + node.procs[i].cacheSize + "," + node.procs[i].busFrequency + ",";
                String str3 = node.procs[i].specInt + "," + node.procs[i].specFp;
                bw.write(str1 + str2 + str3);
                bw.newLine();
            }
            for (int i = 0; i <= node.cnt; i++) {
                saveToFile(node.nodes[i], bw);
            }
        }
    }

    public void print() {
        printLevelOrder(root);
    }

    private void printLevelOrder(Node node) {
        if (node == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (int i = 0; i < current.cnt; i++) {
                if (current.nodes[i] != null) {
                    System.out.print(current.procs[i].key + " ");
                }
                if (current.cnt == 3) {
                    System.out.print(current.procs[i].key + " ");
                } else if (current.cnt == 2) {
                    System.out.print(current.procs[i].key + " - ");
                }
            }
            System.out.println();
            for (int i = 0; i <= current.cnt; i++) {
                if (current.nodes[i] != null) {
                    queue.add(current.nodes[i]);
                }
            }
        }
    }
}
