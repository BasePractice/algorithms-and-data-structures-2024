package ru.mirea.practice.s0000001.part1;

import static java.lang.Math.max;

/**
 * Написать программу на языке Java, использующая
 * функции, разработанные выше, для выполнения операций
 * над бинарным деревом.
 */

public abstract class Task1 {
    public static void main(String[] args) {
        Node a = new Node(1);
        a.lchild = new Node(2);
        a.rchild = new Node(4);
        a.lchild.lchild = new Node(3);
        a.lchild.rchild = new Node(6);

        Node b = new Node(1);
        b.lchild = new Node(2);
        b.rchild = new Node(4);
        b.lchild.lchild = new Node(3);
        b.lchild.rchild = new Node(6);

        Node c = new Node(2);
        c.lchild = new Node(3);
        c.rchild = new Node(5);
        c.lchild.lchild = new Node(4);
        c.lchild.rchild = new Node(12);

        System.out.println("Height a = " + height(a));
        System.out.println("Height b = " + height(b));
        System.out.println("Height c = " + height(c));

        System.out.println("Tree C");
        printTree(c);
        reverse(c);
        System.out.println("Reversed tree C");
        printTree(c);

        System.out.println("Size a = " + size(a));
        System.out.println("Size b = " + size(b));
        System.out.println("Size c = " + size(c));

        System.out.println("a and b are the same tree: " + sameTree(a, b));
        System.out.println("a and c are the same tree: " + sameTree(a, c));
        System.out.println("b and c are the same tree: " + sameTree(b, c));

        System.out.println("Max width a = " + getMaxWidth(a));
        System.out.println("Max width b = " + getMaxWidth(b));
        System.out.println("Max width c = " + getMaxWidth(c));

        System.out.println("lookup 1 in a: " + lookup(a, 1));
        System.out.println("lookup 1 in b: " + lookup(b, 1));
        System.out.println("lookup 1 in c: " + lookup(c, 1));
    }

    static int height(Node root) {
        int h1 = 0;
        int h2 = 0;
        if (root == null) {
            return 0;
        }
        if (root.lchild != null) {
            h1 = height(root.lchild);
        }
        if (root.rchild != null) {
            h2 = height(root.rchild);
        }
        return max(h1, h2) + 1;
    }

    static void reverse(Node tree) {
        Node temp;
        if (tree != null) {
            if (!tree.isLNull() && !tree.isRNull()) {
                temp = tree.lchild;
                tree.lchild = tree.rchild;
                tree.rchild = temp;

                reverse(tree.lchild);
                reverse(tree.rchild);
            } else if (!tree.isLNull() && tree.isRNull()) {
                reverse(tree.lchild);
            } else if (!tree.isRNull() && tree.isLNull()) {
                reverse(tree.rchild);
            }
        }
    }

    static int getMaxWidth(Node node) {
        int maxWdth = 0;
        int i;
        int width = 0;
        int h = height(node);
        for (i = 1; i < h; i++) {
            width = getWidth(node, i);
            if (width > maxWdth) {
                maxWdth = width;
            }
        }
        return maxWdth;
    }

    static int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return size(node.lchild) + 1 + size(node.rchild);
        }
    }

    static boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null) {
            return a.data == b.data && sameTree(a.lchild, b.lchild) && sameTree(a.rchild, b.rchild);
        } else {
            return false;
        }
    }

    static int getWidth(Node node, int lvl) {
        if (node == null) {
            return 0;
        }
        if (lvl == 1) {
            return 1;
        } else if (lvl > 1) {
            return getWidth(node.lchild, lvl - 1) + getWidth(node.rchild, lvl - 1);
        }
        getWidth(node.rchild, lvl - 1);
        return lvl;
    }

    static void printTree(Node root) {
        printTree("", root, false);
    }

    static void printTree(String prefix, Node n, boolean isLeft) {
        if (n != null) {
            printTree(prefix + "    ", n.lchild, true);
            System.out.println(prefix + (isLeft ? "/-- " : "\\-- ") + n.data);
            printTree(prefix + "    ", n.rchild, false);
        }
    }


    static boolean lookup(Node node, int target) {
        if (node == null) {
            return false;
        } else {
            if (target == node.data) {
                return true;
            } else {
                if (target < node.data) {
                    return lookup(node.lchild, target);
                } else {
                    return lookup(node.rchild, target);
                }
            }
        }
    }

    static class Node {
        Node lchild;
        Node rchild;
        int data;

        Node(int data) {
            this.data = data;
            rchild = lchild = null;
        }

        public boolean isLNull() {
            return lchild == null;
        }

        public boolean isRNull() {
            return rchild == null;
        }
    }
}
