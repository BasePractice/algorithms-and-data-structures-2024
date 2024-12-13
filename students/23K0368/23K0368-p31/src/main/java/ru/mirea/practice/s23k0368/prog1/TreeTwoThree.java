package ru.mirea.practice.s23k0368.prog1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.ArrayList;
import java.util.List;

public abstract class TreeTwoThree {
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        int height = getHeight(root);
        List<String> levels = new ArrayList<>();

        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        for (int level = 0; level < height; level++) {
            int levelSize = queue.size();
            int spacesBefore = (int) Math.pow(2, height - level - 1) - 1;
            int spacesBetween = (int) Math.pow(2, height - level) - 1;

            StringBuilder levelString = new StringBuilder(" ".repeat(spacesBefore));
            List<Node> currentLevelNodes = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                levelString.append(node.data);
                currentLevelNodes.add(node);

                if (i < levelSize - 1) {
                    levelString.append(" ".repeat(spacesBetween));
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            levels.add(levelString.toString());
        }

        for (int i = levels.size() - 1; i >= 0; i--) {
            System.out.println(levels.get(i));
        }
    }


    private static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
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
