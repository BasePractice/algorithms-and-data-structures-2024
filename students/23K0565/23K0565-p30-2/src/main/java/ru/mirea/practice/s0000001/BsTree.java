package ru.mirea.practice.s0000001;

public class BsTree {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.data) {
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.data) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.data) {
            root.right = deleteRec(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            root = root.left;
            minVal = root.data;
        }
        return minVal;
    }

    public void deleteTree() {
        root = null;
        System.out.println("Дерево удалено.");
    }

    public static void main(String[] args) {
        BsTree tree = new BsTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80, 10, 35, 65};
        for (int val : values) {
            tree.insert(val);
        }

        System.out.println("Содержимое дерева до удаления такое:");
        tree.inorder();

        tree.delete(40);
        System.out.println("Содержимое дерева после удаления узла со значением 40:");
        tree.inorder();

        tree.deleteTree();
    }
}
