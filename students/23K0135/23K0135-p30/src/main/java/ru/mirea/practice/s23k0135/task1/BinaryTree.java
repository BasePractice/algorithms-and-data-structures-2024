package ru.mirea.practice.s23k0135.task1;

public class BinaryTree {
    Node rootNode;

    int calculateHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = calculateHeight(node.left);
            int rightHeight = calculateHeight(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    boolean search(Node node, int target) {
        if (node == null) {
            return false;
        } else if (node.data == target) {
            return true;
        } else if (target < node.data) {
            return search(node.left, target);
        } else {
            return search(node.right, target);
        }
    }

    int getSize(Node node) {
        if (node == null) {
            return 0;
        } else {
            return getSize(node.left) + 1 + getSize(node.right);
        }
    }

    int findMaxWidth(Node root) {
        int maxWidth = 0;
        int treeHeight = this.calculateHeight(root);
        for (int i = 1; i <= treeHeight; i++) {
            int levelWidth = getWidthAtLevel(root, i);
            if (levelWidth > maxWidth) {
                maxWidth = levelWidth;
            }
        }
        return maxWidth;
    }

    int getWidthAtLevel(Node root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else {
            return getWidthAtLevel(root.left, level - 1) + getWidthAtLevel(root.right, level - 1);
        }
    }

    boolean areTreesIdentical(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null) {
            return a.data == b.data && areTreesIdentical(a.left, b.left) && areTreesIdentical(a.right, b.right);
        } else {
            return false;
        }
    }

    void performInorderTraversal(Node node) {
        if (node != null) {
            performInorderTraversal(node.left);
            System.out.print(node.data + " ");
            performInorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.rootNode = new Node(5);
        tree.rootNode.left = new Node(3);
        tree.rootNode.right = new Node(8);
        tree.rootNode.left.left = new Node(2);
        tree.rootNode.left.right = new Node(4);
        tree.rootNode.right.left = new Node(7);
        tree.rootNode.right.right = new Node(9);

        System.out.println("Обход бинарного дерева в порядке убывания:");
        tree.performInorderTraversal(tree.rootNode);

        System.out.println("\nВысота дерева: " + tree.calculateHeight(tree.rootNode));
        System.out.println("Размер дерева: " + tree.getSize(tree.rootNode));
        System.out.println("Максимальная ширина дерева: " + tree.findMaxWidth(tree.rootNode));

        int target = 4;
        System.out.println("Поиск " + target + ": " + tree.search(tree.rootNode, target));

        BinaryTree tree2 = new BinaryTree();
        tree2.rootNode = new Node(5);
        tree2.rootNode.left = new Node(3);
        tree2.rootNode.right = new Node(8);
        tree2.rootNode.left.left = new Node(2);
        tree2.rootNode.left.right = new Node(4);
        tree2.rootNode.right.left = new Node(7);
        tree2.rootNode.right.right = new Node(9);

        System.out.println("Являются ли эти два дерева одинаковыми? " + tree.areTreesIdentical(tree.rootNode, tree2.rootNode));
    }
}
