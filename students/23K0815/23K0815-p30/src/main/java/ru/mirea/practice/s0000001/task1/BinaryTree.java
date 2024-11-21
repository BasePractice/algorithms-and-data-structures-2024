package ru.mirea.practice.s0000001.task1;

class BinaryTree {
    Node root;

    int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    boolean contains(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (node.value == target) {
            return true;
        }
        return target < node.value ? contains(node.left, target) : contains(node.right, target);
    }

    int getNodeCount(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getNodeCount(node.left) + getNodeCount(node.right);
    }

    int getMaxTreeWidth(Node root) {
        int maxWidth = 0;
        int height = getHeight(root);
        for (int i = 1; i <= height; i++) {
            int widthAtLevel = calculateWidth(root, i);
            maxWidth = Math.max(maxWidth, widthAtLevel);
        }
        return maxWidth;
    }

    int calculateWidth(Node root, int level) {
        if (root == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        }
        return calculateWidth(root.left, level - 1) + calculateWidth(root.right, level - 1);
    }

    boolean areIdentical(Node treeA, Node treeB) {
        if (treeA == null && treeB == null) {
            return true;
        }
        if (treeA != null && treeB != null) {
            return treeA.value == treeB.value && areIdentical(treeA.left, treeB.left) && areIdentical(treeA.right, treeB.right);
        }
        return false;
    }

    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.value + " ");
            inOrderTraversal(node.right);
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

        System.out.println("In-order traversal of the binary tree:");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nHeight of the tree: " + tree.getHeight(tree.root));
        System.out.println("Total nodes in the tree: " + tree.getNodeCount(tree.root));
        System.out.println("Maximum width of the tree: " + tree.getMaxTreeWidth(tree.root));

        int searchValue = 4;
        System.out.println("Searching for " + searchValue + ": " + tree.contains(tree.root, searchValue));

        BinaryTree anotherTree = new BinaryTree();
        anotherTree.root = new Node(5);
        anotherTree.root.left = new Node(3);
        anotherTree.root.right = new Node(8);
        anotherTree.root.left.left = new Node(2);
        anotherTree.root.left.right = new Node(4);
        anotherTree.root.right.left = new Node(7);
        anotherTree.root.right.right = new Node(9);

        System.out.println("Are these two trees identical? " + tree.areIdentical(tree.root, anotherTree.root));
    }
}