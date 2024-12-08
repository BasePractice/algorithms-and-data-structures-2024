package ru.mirea.practice.s00000030.task1;

public class TreeNode {
    int frequency;
    char character;
    TreeNode left;
    TreeNode right;

    TreeNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }
}
