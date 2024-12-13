package ru.mirea.practice.s23k0368.prog2;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class TreeTwoThree {
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        int height = getHeight(root);
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        for (int level = 0; level < height; level++) {
            int levelSize = queue.size();
            int spacesBefore = (int) Math.pow(2, height - level - 1) - 1;
            int spacesBetween = (int) Math.pow(2, height - level) - 1;

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                System.out.print(" ".repeat(spacesBefore));
                System.out.print(node.data);

                if (node.middle != null) {
                    System.out.print("  " + node.middle.data);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.middle != null) {
                        queue.offer(node.middle);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                } else if (node.left != null && node.right != null) {
                    System.out.print("-");
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                } else {
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }

                if (i < levelSize - 1) {
                    System.out.print(" ".repeat(spacesBetween));
                }
            }
            System.out.println();
        }
    }

    private static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(Math.max(getHeight(root.left), getHeight(root.middle)), getHeight(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        printTree(root);
    }
}
