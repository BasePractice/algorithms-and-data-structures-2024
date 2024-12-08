package ru.mirea.practice.s23k0155;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node node) {
        this.root = node;
    }

    public void add(int element) {
        root = addElement(root, element);
    }

    private Node addElement(Node node,int element) {
        if (node == null) {
            return new Node(element);
        }
        if (node.value > element) {
            node.left = addElement(node.left, element);
        } else if (node.value < element) {
            node.rirht = addElement(node.rirht, element);
        }
        return node;
    }

    public void printTree() {
        helpPrint(root);
        System.out.println();
    }

    private void helpPrint(Node node) {
        if (node != null) {
            helpPrint(node.left);
            System.out.print(node.value + " ");
            helpPrint(node.rirht);
        }
    }

    public int height(Node node) {

        if (node == null) {
            return 0;
        }

        int h1 = 0;
        if (node.left != null) {
            h1 = height(node.left);
        }

        int h2 = 0;
        if (node.rirht != null) {
            h2 = height(node.rirht);
        }
        return Math.max(h1, h2) + 1;
    }

    public void reverse(Node node) {
        if (node != null) {
            if (node.left != null && node.rirht != null) {
                Node temp = node.left;
                node.left = node.rirht;
                node.rirht = temp;
            } else if (node.left != null && node.rirht == null) {
                reverse(node.left);
            } else if (node.left == null && node.rirht != null) {
                reverse(node.rirht);
            }
        }
    }

    public int lookup(Node node, int target) {
        if (node == null) {
            return 0;
        } else {
            if (target == node.value) {
                return 1;
            } else {
                if (target < node.value) {
                    return lookup(node.left, target);
                } else {
                    return lookup(node.rirht, target);
                }
            }
        }
    }

    public int getWidth(Node node, int level) {

        if (node == null) {
            return 0;
        }

        if (level == 1) {
            return 1;
        } else if (level > 1) {
            return getWidth(node.left, level - 1) + getWidth(node.rirht, level - 1);
        }
        return 0;
    }

    public int getMaxWidth(Node root) {
        int maxWdth = 0;
        int width = 0;
        for (int i = 0; i < height(root); i++) {
            width = getWidth(root, i);
            if (width > maxWdth) {
                maxWdth = width;
            }
        }
        return maxWdth;
    }

    public int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return size(node.left) + size(node.rirht) + 1;
        }
    }

    public boolean sameTree(Node tree1, Node tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        } else if (tree1 != null && tree2 != null) {
            return tree1.value == tree2.value && sameTree(tree1.left, tree2.left)
                && sameTree(tree1.rirht, tree2.rirht);
        } else {
            return false;
        }
    }
}
