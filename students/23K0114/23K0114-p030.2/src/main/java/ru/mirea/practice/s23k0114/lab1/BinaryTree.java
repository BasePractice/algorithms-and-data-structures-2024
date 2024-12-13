package ru.mirea.practice.s23k0114.lab1;


class BinaryTree {
    Node root;
    int count;

    public BinaryTree() {
        root = null;
        count = 0;
    }

    public void insert(int item) {
        Node newNode = new Node(item);
        if (root == null) {
            root = newNode;
            count++;
            return;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;
            if (item < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    count++;
                    return;
                }
            } else if (item > current.data) {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    count++;
                }
                return;
            } else {
                return;
            }
        }
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node node) {
        if (node != null) {
            inorderRec(node.left);
            System.out.print(node.data + " ");
            inorderRec(node.right);
        }
    }

    public void delete(int key) {
        Node current = root;
        Node parent = null;

        while (current != null && current.data != key) {
            parent = current;
            if (key < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (current == null) {
            return;
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (parent.left == current) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.left == null || current.right == null) {
            Node child = (current.left != null) ? current.left : current.right;
            if (current == root) {
                root = child;
            } else if (parent.left == current) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        } else {
            Node successor = findMin(current.right);
            int val = successor.data;
            delete(successor.data);
            current.data = val;
        }

        count--;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void destroyTree() {
        root = null;
        count = 0;
    }
}
