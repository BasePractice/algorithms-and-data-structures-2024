package mirea.lab30.p1;

public class BinaryTreeOps {
    Node node;

    public int height(Node p) {
        int h1 = 0;
        int h2 = 0;
        if (p == null) {
            return 0;
        }
        if (p.left != null) {
            h1 = height(p.left);
        }
        if (p.right != null) {
            h2 = height(p.right);
        }
        return Math.max(h1, h2) + 1;
    }

    public void reverse(Node p) {
        if (p != null) {
            if (p.left != null && p.right != null) {
                Node temp = p.left;
                p.left = p.right;
                p.right = temp;
                reverse(p.left);
                reverse(p.right);
            } else if (p.right == null) {
                reverse(p.left);
            } else {
                reverse(p.right);
            }
        }
    }

    public int lookup(Node node, int target) {
        if (node != null) {
            if (target == node.cur) {
                return 1;
            } else if (target < node.cur) {
                return lookup(node.left, target);
            } else {
                return lookup(node.right, target);
            }
        }
        return 0;
    }

    public int size(Node node) {
        if (node != null) {
            return size(node.left) + 1 + size(node.right);
        }
        return 0;
    }

    public boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null) {
            return a.cur == b.cur && sameTree(a.left, b.left) && sameTree(a.right, b.right);
        } else {
            return false;
        }
    }
}
