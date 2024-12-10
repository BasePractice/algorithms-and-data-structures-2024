package ru.mirea.practice.s23k0823.task1.task1.task2.task1.task1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public abstract class LevelOrderTraversal {

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        int height = getHeight(root);

        Stack<String> levels = new Stack<>();

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        for (int level = 0; level < height; level++) {
            int levelSize = queue.size();

            int spacesBeforeFirstNode = (int) Math.pow(2, height - level - 1) - 1;

            int spacesBetweenNodes = (int) Math.pow(2, height - level) - 1;

            StringBuilder levelString = new StringBuilder(" ".repeat(spacesBeforeFirstNode));

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                levelString.append(node.data);

                if (i < levelSize - 1) {
                    levelString.append(" ".repeat(spacesBetweenNodes));
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            levels.push(levelString.toString());
        }

        while (!levels.isEmpty()) {
            System.out.println(levels.pop());
        }
    }

    private static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
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

