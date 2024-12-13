package ru.mirea.practice.s0000001.num1;

final class Main {
    private Main() { }  // Приватный конструктор, чтобы предотвратить создание экземпляров

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinarySearchTree {
        Node root;

        BinarySearchTree() {
            this.root = null;
        }

        static void insert(BinarySearchTree tree, int val) {
            tree.root = insertRec(tree.root, val);
        }

        static Node insertRec(Node root, int val) {
            if (root == null) {
                return new Node(val);
            }
            if (val < root.val) {
                root.left = insertRec(root.left, val);
            } else if (val > root.val) {
                root.right = insertRec(root.right, val);
            }
            return root;
        }

        static void delete(BinarySearchTree tree, int val) {
            tree.root = deleteRec(tree.root, val);
        }

        static Node deleteRec(Node root, int val) {
            if (root == null) {
                return root;
            }

            if (val < root.val) {
                root.left = deleteRec(root.left, val);
            } else if (val > root.val) {
                root.right = deleteRec(root.right, val);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                root.val = minValue(root.right);
                root.right = deleteRec(root.right, root.val);
            }
            return root;
        }

        static int minValue(Node root) {
            int minVal = root.val;
            while (root.left != null) {
                minVal = root.left.val;
                root = root.left;
            }
            return minVal;
        }

        static void inorder(BinarySearchTree tree) {
            inorderRec(tree.root);
            System.out.println();
        }

        static void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.val + " ");
                inorderRec(root.right);
            }
        }

        static void deleteTree(BinarySearchTree tree) {
            tree.root = null;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {50, 30, 20, 40, 70, 60, 80, 10, 25, 35};
        for (int val : values) {
            BinarySearchTree.insert(tree, val);
        }

        System.out.println("Дерево после вставки узлов:");
        BinarySearchTree.inorder(tree);

        BinarySearchTree.delete(tree, 20);
        System.out.println("Дерево после удаления узла 20:");
        BinarySearchTree.inorder(tree);

        BinarySearchTree.deleteTree(tree);
        System.out.println("Дерево удалено.");
    }
}
