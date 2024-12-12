package ru.mirea.practice.s23k0116.task;

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
                    return;
                }
            } else {
                System.out.println("Элемент " + item + " уже существует в дереве.");
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
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            System.out.println("Узел " + key + " не найден.");
            return null;
        }

        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node successor = findMin(root.right);
                root.data = successor.data;
                root.right = deleteRec(root.right, successor.data);
            }
            count--;
        }
        return root;
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

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] nodes = {5, 4, 44, 2, 1, 12, 6, 3, 8, 19, 10};
        for (int node : nodes) {
            tree.insert(node);
        }

        System.out.println("Содержимое дерева в сортированном порядке:");
        tree.inorder();

        int keyToDelete = 5;
        System.out.println("Удаление узла: " + keyToDelete);
        tree.delete(keyToDelete);

        System.out.println("Содержимое дерева после удаления узла:");
        tree.inorder();

        tree.destroyTree();
        System.out.println("Полное удаление дерева.");
    }
}

