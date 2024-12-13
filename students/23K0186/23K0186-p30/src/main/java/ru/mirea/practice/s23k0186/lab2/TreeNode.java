package ru.mirea.practice.s23k0145.lab2;

class TreeNode implements Comparable<TreeNode> {
    int frequency;
    char character;
    TreeNode left;
    TreeNode right;

    public TreeNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }

    @Override
    public int compareTo(TreeNode otherNode) {
        return this.frequency - otherNode.frequency;
    }
}
