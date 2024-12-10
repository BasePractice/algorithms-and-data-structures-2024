package ru.mirea.practice.s0000001;


public class BinaryTree {
    Nodee root;

    int height(Nodee nodee) {
        if (nodee == null) {
            return 0;
        }
        return Math.max(height(nodee.left), height(nodee.right)) + 1;
    }

    void reverse(Nodee p) {
        if (p != null) {
            Nodee temp = p.left;
            p.left = p.right;
            p.right = temp;

            reverse(p.left);
            reverse(p.right);
        }
    }

    int lookup(Nodee nodee, int target) {
        if (nodee == null) {
            return 0;
        }
        if (target == nodee.data) {
            return 1;
        }
        return target < nodee.data ? lookup(nodee.left, target) : lookup(nodee.right, target);
    }

    int getMaxWidth(Nodee root) {
        int maxWdth = 0;
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            int width = getWidth(root, i);
            if (width > maxWdth) {
                maxWdth = width;
            }
        }
        return maxWdth;
    }


    int getWidth(Nodee nodee, int level) {
        if (nodee == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        }
        return getWidth(nodee.left, level - 1) + getWidth(nodee.right, level - 1);
    }

    int size(Nodee nodee) {
        if (nodee == null) {
            return 0;
        }
        return size(nodee.left) + 1 + size(nodee.right);
    }



    boolean sameTree(Nodee a, Nodee b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        return a.data == b.data && sameTree(a.left, b.left) && sameTree(a.right, b.right);
    }
}
