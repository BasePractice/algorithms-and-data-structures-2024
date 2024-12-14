package ru.mirea.practice.s230k754.lab11.task1;



public class Main {
    public int height(Tree tree) {
        if (tree == null) {
            return 0;
        }

        int h1 = 0;
        int h2 = 0;

        if (tree.left != null) {
            h1 = height(tree.left);
        }
        if (tree.right != null) {
            h2 = height(tree.right);
        }
        if (h1 > h2) {
            return h1 + 1;
        } else {
            return h2 + 1;
        }
    }

    public void reverse(Tree tree) {
        if (tree != null) {
            Tree temp = tree.left;
            tree.left = tree.right;
            tree.right = temp;

            reverse(tree.left);
            reverse(tree.right);
        }
    }

    public int lookup(Tree node, int target) {
        if (node == null) {
            return 0;
        } else {
            if (target == node.data) {
                return 1;
            } else {
                if (target < node.data) {
                    return lookup(node.left, target);
                } else {
                    return lookup(node.right, target);
                }
            }
        }
    }

    public int getMaxWidth(Tree tree) {
        int maxWidth = 0;
        int width = 0;
        int height = height(tree);
        for (int i = 0; i < height; i++) {
            width = getWidth(tree, i);
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        return maxWidth;

    }

    public int getWidth(Tree tree, int level) {
        if (level == 0) {
            return 0;
        } else if (level == 1) {
            return 1;
        } else if (level > 1) {
            return getWidth(tree.left, level - 1) + getWidth(tree.right, level - 1);
        }
        return getWidth(tree.right, level - 1);
    }

    public int size(Tree tree) {
        if (tree == null) {
            return 0;
        } else {
            return size(tree.left) + size(tree.right) + 1;
        }
    }

    public boolean sameTree(Tree tree1, Tree tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        } else {
            if (tree1 != null && tree2 != null) {
                return tree1.data == tree2.data && sameTree(tree1.left,tree2.left) && sameTree(tree1.right,tree2.right);
            } else {
                return false;
            }
        }
    }

    public void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);

        System.out.println("Height of the binary tree is: " + height(root));
        printTree(root);
        reverse(root);
        System.out.println();
        printTree(root);

        System.out.println();
        int target = 4;
        if (lookup(root, target) == 1) {
            System.out.println("Значение " + target + " найдено в дереве.");
        } else {
            System.out.println("Значение " + target + " не найдено в дереве.");
        }
        System.out.println(getMaxWidth(root));
        System.out.println(size(root));
        System.out.println(sameTree(root, root));
    }

    public void printTree(Tree node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.data + " ");
            printTree(node.right);
        }
    }
}
