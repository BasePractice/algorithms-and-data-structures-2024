package ru.mirea.practice.s23k0143;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class TwoThreeTree {
    Node root;

    public TwoThreeTree() {
        root = null;
    }

    public void insert(ProcessorRecord record) {
        if (root == null) {
            root = new Node();
            root.records.add(record);
        } else {
            Node newRoot = insert(root, record);
            if (newRoot != null) {
                root = newRoot;
            }
        }
    }

    private Node insert(Node node, ProcessorRecord record) {
        if (node.isLeaf) {
            node.records.add(record);
            node.records.sort((r1, r2) -> Integer.compare(r1.key, r2.key));
            if (node.records.size() <= 3) {
                return null;
            } else {
                return splitNode(node);
            }
        } else {
            for (int i = 0; i < node.records.size(); i++) {
                if (record.key < node.records.get(i).key) {
                    Node newChild = insert(node.children.get(i), record);
                    if (newChild != null) {
                        node.records.add(i, newChild.records.get(0));
                        node.children.add(i + 1, newChild.children.get(1));
                        if (node.records.size() > 3) {
                            return splitNode(node);
                        }
                    }
                    return null;
                }
            }
            Node newChild = insert(node.children.get(node.children.size() - 1), record);
            if (newChild != null) {
                node.records.add(newChild.records.get(0));
                node.children.add(newChild.children.get(1));
                if (node.records.size() > 3) {
                    return splitNode(node);
                }
            }
            return null;
        }
    }

    private Node splitNode(Node node) {
        Node newNode = new Node();
        newNode.isLeaf = node.isLeaf;
        newNode.records.add(node.records.get(2));
        node.records.remove(2);
        if (!node.isLeaf) {
            newNode.children.add(node.children.get(2));
            newNode.children.add(node.children.get(3));
            node.children.subList(2, 4).clear();
        }
        return newNode;
    }

    public boolean delete(int key) {
        if (root == null) {
            return false;
        }

        boolean deleted = delete(root, key);
        if (root.records.isEmpty()) {
            root = root.children.isEmpty() ? null : root.children.get(0);
        }

        return deleted;
    }

    private boolean delete(Node node, int key) {
        if (node.isLeaf) {
            for (int i = 0; i < node.records.size(); i++) {
                if (node.records.get(i).key == key) {
                    node.records.remove(i);
                    return true;
                }
            }
            return false;
        } else {
            for (int i = 0; i < node.records.size(); i++) {
                if (key < node.records.get(i).key) {
                    boolean deleted = delete(node.children.get(i), key);
                    if (deleted) {
                        if (node.children.get(i).records.size() < 1) {
                            node.children.remove(i);
                            if (i > 0) {
                                node.records.remove(i - 1);
                            } else {
                                node.records.remove(i);
                            }
                        }
                        return true;
                    }
                    return false;
                }
            }
            boolean deleted = delete(node.children.get(node.children.size() - 1), key);
            if (deleted) {
                if (node.children.get(node.children.size() - 1).records.size() < 1) {
                    node.children.remove(node.children.size() - 1);
                }
            }
            return deleted;
        }
    }

    public void printLevelOrder() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (ProcessorRecord rec : current.records) {
                System.out.print(rec.key + " ");
            }
            System.out.println();
            if (!current.isLeaf) {
                for (Node child : current.children) {
                    queue.add(child);
                }
            }
        }
    }

    public ProcessorRecord search(int key) {
        return search(root, key);
    }

    private ProcessorRecord search(Node node, int key) {
        if (node == null) {
            return null;
        }
        for (ProcessorRecord record : node.records) {
            if (record.key == key) {
                return record;
            }
        }
        for (int i = 0; i <= node.records.size(); i++) {
            if (i == node.records.size() || key < node.records.get(i).key) {
                return search(i < node.children.size() ? node.children.get(i) : null, key);
            }
        }
        return null;
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            saveToFile(root, writer);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении в файл: " + e.getMessage());
        }
    }

    private void saveToFile(Node node, BufferedWriter writer) throws IOException {
        if (node == null) {
            return;
        }
        for (ProcessorRecord record : node.records) {
            writer.write(record.key + ", " + record.name + ", " + record.clockSpeed + ", "
                + record.cacheSize + ", " + record.busSpeed + ", "
                + record.specInt + ", " + record.specFp);
            writer.newLine();
        }
        for (Node child : node.children) {
            saveToFile(child, writer);
        }
    }
}

