package ru.mirea.practice.s23k0823.task1.task1.task2.task1;

class BinaryTree {
    Node root;

    int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    boolean lookup(Node node, int target) {
        if (node == null) {
            return false;
        } else if (node.data == target) {
            return true;
        } else if (target < node.data) {
            return lookup(node.left, target);
        } else {
            return lookup(node.right, target);
        }
    }

    int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return size(node.left) + 1 + size(node.right);
        }
    }

    int getMaxWidth(Node root) {
        int maxWidth = 0;
        int height = this.height(root);
        for (int i = 1; i <= height; i++) {
            int width = getWidth(root, i);
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        return maxWidth;
    }

    int getWidth(Node root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else {
            return getWidth(root.left, level - 1) + getWidth(root.right, level - 1);
        }
    }

    boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null) {
            return a.data == b.data && sameTree(a.left, b.left) && sameTree(a.right, b.right);
        } else {
            return false;
        }
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(2);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(9);

        System.out.println("Обход бинарного дерева в порядке убывания:");
        tree.inorder(tree.root);

        System.out.println("\nВысота дерева: " + tree.height(tree.root));
        System.out.println("Размер дерева: " + tree.size(tree.root));
        System.out.println("Максимальная ширина дерева: " + tree.getMaxWidth(tree.root));

        int target = 4;
        System.out.println("Поиск " + target + ": " + tree.lookup(tree.root, target));

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(5);
        tree2.root.left = new Node(3);
        tree2.root.right = new Node(8);
        tree2.root.left.left = new Node(2);
        tree2.root.left.right = new Node(4);
        tree2.root.right.left = new Node(7);
        tree2.root.right.right = new Node(9);

        System.out.println("Являются ли эти два дерева одинаковыми? " + tree.sameTree(tree.root, tree2.root));
    }
}
