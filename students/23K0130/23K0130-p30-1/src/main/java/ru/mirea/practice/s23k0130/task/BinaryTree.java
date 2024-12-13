package ru.mirea.practice.s23k0130.task;

public class BinaryTree {
    Node root;

    int height(Node node) {
        if (node == null) {
            return 0;
        }
        int heighLeft = height(node.left);
        int heighRight = height(node.right);
        return Math.max(heighLeft, heighRight) + 1;
    }

    boolean lookup(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (node.data == target) {
            return true;
        }
        if (target < node.data) {
            return lookup(node.left, target);
        } else {
            return lookup(node.right, target);
        }
    }

    int getMaxWidth(Node root) {
        int h = this.height(this.root);
        int maxWidth = 0;
        for (int i = 1; i <= h; i++) {
            int w = getWidth(this.root, i);
            if (w > maxWidth) {
                maxWidth = w;
            }
        }
        return maxWidth;
    }

    int getWidth(Node node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        }
        return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
    }

    int size(Node node) {
        if (node == null) {
            return 0;
        }
        return size(node.left) + 1 + size(node.right);
    }

    boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b != null) {
            return a.data == b.data
                    && sameTree(a.left, b.left)
                    && sameTree(a.right, b.right);
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(4);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(10);
        System.out.println("Высота дерева: " + tree.height(tree.root));
        System.out.println("Размер дерева: " + tree.size(tree.root));
        System.out.println("Максимальная ширина дерева: " + tree.getMaxWidth(tree.root));
        int target1 = 5;
        System.out.println("Поиск " + target1 + ": " + tree.lookup(tree.root, target1));
        int target2 = 2;
        System.out.println("Поиск " + target2 + ": " + tree.lookup(tree.root, target2));
        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(1);
        tree2.root.left = new Node(1);
        tree2.root.right = new Node(1);
        System.out.println("Являются ли эти два дерева одинаковыми? " + tree.sameTree(tree.root, tree2.root));
    }
}
