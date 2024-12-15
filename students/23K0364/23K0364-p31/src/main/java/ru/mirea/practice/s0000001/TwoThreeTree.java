package ru.mirea.practice.s0000001;

import java.util.List;
import java.util.ArrayList;

class TwoThreeTree {
    class Node {
        List<Integer> keys = new ArrayList<>();
        List<Node> children = new ArrayList<>();
        Processor processor;
        boolean isLeaf;

        Node(Processor processor) {
            this.processor = processor;
            this.keys.add(processor.key);
            this.isLeaf = true;
        }

        Node(int key) {
            this.keys.add(key);
        }

        @Override
        public String toString() {
            if (isLeaf) {
                return String.valueOf(keys.get(0));
            } else if (keys.size() == 1) {
                return keys.get(0) + " -";
            } else {
                return keys.get(0) + " " + keys.get(1);
            }
        }
    }

    Node root;

    public void insert(Processor processor) {
        if (root == null) {
            root = new Node(processor);
        } else {
            Node newRoot = insertRecursive(root, processor);
            if (newRoot != null) {
                Node oldRoot = root;
                root = new Node(newRoot.keys.get(0));
                root.children.add(oldRoot);
                root.children.add(newRoot);
                root.isLeaf = false;
            }
        }
    }

    private Node insertRecursive(Node node, Processor processor) {
        if (node.isLeaf) {
            node.keys.add(processor.key);
            node.keys.sort(Integer::compareTo);

            if (node.keys.size() > 2) {
                return splitNode(node);
            }
            return null;
        } else {
            int key = processor.key;

            Node child;
            if (key < node.keys.get(0)) {
                child = node.children.get(0);
            } else if (node.keys.size() == 1 || key < node.keys.get(1)) {
                child = node.children.get(1);
            } else {
                child = node.children.get(2);
            }

            Node newChild = insertRecursive(child, processor);
            if (newChild != null) {
                node.keys.add(newChild.keys.get(0));
                node.keys.sort(Integer::compareTo);
                node.children.add(node.children.indexOf(child) + 1, newChild);

                if (node.keys.size() > 2) {
                    return splitNode(node);
                }
            }
            return null;
        }
    }

    private Node splitNode(Node node) {
        Node newNode = new Node(node.keys.get(2));
        newNode.isLeaf = node.isLeaf;

        if (!node.isLeaf) {
            newNode.children.add(node.children.remove(2));
            newNode.children.add(node.children.remove(2));
        }

        node.keys.remove(2);
        return newNode;
    }

    public void printTree() {
        if (root == null) {
            System.out.println("Дерево пустое.");
            return;
        }
        printTreeRecursively(root);
    }

    private void printTreeRecursively(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        for (Node child : node.children) {
            printTreeRecursively(child);
        }
    }

    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    private Node deleteRecursive(Node node, int key) {
        if (node == null) {
            System.out.println("Запись с ключом " + key + " не найдена.");
            return null;
        }

        if (node.isLeaf) {
            if (node.keys.contains(key)) {
                node.keys.remove(Integer.valueOf(key));
                if (node.keys.isEmpty()) {
                    return null;
                }
            } else {
                System.out.println("Запись с ключом " + key + " не найдена.");
            }
            return node;
        }

        if (key < node.keys.get(0)) {
            Node child = deleteRecursive(node.children.get(0), key);
            node.children.set(0, child);
        } else if (node.keys.size() == 1 || key < node.keys.get(1)) {
            Node child = deleteRecursive(node.children.get(1), key);
            node.children.set(1, child);
        } else {
            Node child = deleteRecursive(node.children.get(2), key);
            node.children.set(2, child);
        }
        return node;
    }

    public List<Processor> toList() {
        List<Processor> result = new ArrayList<>();
        collectProcessors(root, result);
        return result;
    }

    private void collectProcessors(Node node, List<Processor> result) {
        if (node == null) {
            return;
        }

        if (node.isLeaf) {
            if (node.processor != null) {
                result.add(node.processor);
            }
        }

        for (Node child : node.children) {
            collectProcessors(child, result);
        }
    }
}
