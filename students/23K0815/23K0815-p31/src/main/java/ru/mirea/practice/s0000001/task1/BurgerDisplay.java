package ru.mirea.practice.s0000001.task1;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class BurgerDisplay {

    public static void displayBurgerTree(BurgerNode root) {
        if (root == null) {
            return;
        }

        int height = calculateHeight(root);
        Deque<BurgerNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int spacesBefore = (int) Math.pow(2, height - level - 1) - 1;
            int spacesBetween = (int) Math.pow(2, height - level) - 1;

            System.out.print(" ".repeat(spacesBefore));

            for (int i = 0; i < levelSize; i++) {
                BurgerNode node = queue.poll();
                System.out.print(node.patty);

                if (i < levelSize - 1) {
                    System.out.print(" ".repeat(spacesBetween));
                }

                if (node.lettuce != null) {
                    queue.offer(node.lettuce);
                }
                if (node.tomato != null) {
                    queue.offer(node.tomato);
                }
                if (node.onion != null) {
                    queue.offer(node.onion);
                }
            }
            System.out.println();
            level++;
        }
    }

    // Function to compute the height of the burger tree
    private static int calculateHeight(BurgerNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(Math.max(calculateHeight(root.lettuce), calculateHeight(root.tomato)), calculateHeight(root.onion));
    }

    public static void main(String[] args) {
        BurgerNode root = new BurgerNode(5);
        root.lettuce = new BurgerNode(2);
        root.tomato = new BurgerNode(3);
        root.onion = new BurgerNode(6);
        root.lettuce.lettuce = new BurgerNode(1);
        root.lettuce.onion = new BurgerNode(2);
        root.tomato.lettuce = new BurgerNode(4);
        root.onion.lettuce = new BurgerNode(5);
        root.onion.onion = new BurgerNode(6);

        displayBurgerTree(root);
    }
}