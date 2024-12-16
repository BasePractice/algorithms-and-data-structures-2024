package ru.mirea.practice.s0000001.task1;

public abstract class Weight {
    public static int widht(Node node) {
        int maxWidht = 0;
        int widht = 0;
        int h = height(node);
        for (int i = 1; i < h; i++) {
            widht = getWidht(node, i);
            maxWidht = Math.max(widht, maxWidht);
        }
        return maxWidht;
    }

    public static int getWidht(Node node, int level) {
        if (node == null) {
            return 0;
        } else if (level == 1) {
            return 1;
        } else {
            return getWidht(node.left, level - 1) + getWidht(node.right, level - 1);
        }
    }

    public static int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight + 1, rightHeight + 1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Вес дерева: " + widht(root));
    }
}
