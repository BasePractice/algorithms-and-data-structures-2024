package ru.mirea.practice.s23k0368.prog3;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class TreeForExample {

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        int height = getHeight(root);
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int spacesBefore = (int) Math.pow(2, height - level - 1) - 1;
            int spacesBetween = (int) Math.pow(2, height - level) - 1;

            System.out.print(" ".repeat(spacesBefore));

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                System.out.print(node.data);

                if (i < levelSize - 1) {
                    System.out.print(" ".repeat(spacesBetween));
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.middle != null) {
                    queue.offer(node.middle);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            System.out.println();
            level++;
        }
    }

    //Функция для вычисления высоты дерева
    private static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(Math.max(getHeight(root.left), getHeight(root.middle)), getHeight(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.middle = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        root.middle.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);

        printTree(root);
    }
}
