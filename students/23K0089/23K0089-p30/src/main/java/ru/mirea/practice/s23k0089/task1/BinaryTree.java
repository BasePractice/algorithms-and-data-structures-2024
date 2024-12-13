package ru.mirea.practice.s23k0089.task1;

public class BinaryTree<E> {
    private E data;
    private BinaryTree<E> left;
    private BinaryTree<E> right;

    public BinaryTree() {
        left = null;
        right = null;
        data = null;
    }

    public BinaryTree(E data) {
        left = null;
        right = null;
        this.data = data;
    }

    public static <E> int height(BinaryTree<E> tree) {
        int height1 = 0;
        int height2 = 0;
        if (tree == null) {
            return 0;
        }
        if (tree.getLeft() != null) {
            height1 = height(tree.getLeft());
        }
        if (tree.getRight() != null) {
            height2 = height(tree.getRight());
        }
        return Math.max(height1, height2) + 1;
    }

    public int height() {
        return height(this);
    }

    public static <E> void reverse(BinaryTree<E> tree) {
        BinaryTree<E> treeTemp;
        if (tree != null) {
            if (tree.getRight() != null && tree.getLeft() != null) {
                treeTemp = tree.getLeft();
                tree.setLeft(tree.getRight());
                tree.setRight(treeTemp);
                reverse(tree.getRight());
                reverse(tree.getLeft());
            } else if (tree.getRight() == null && tree.getLeft() != null) {
                reverse(tree.getLeft());
            } else if (tree.getRight() != null && tree.getLeft() == null) {
                reverse(tree.getRight());
            }
        }
    }

    public void reverse() {
        reverse(this);
    }

    public static <E> boolean lookup(BinaryTree<E> tree, Comparable<E> data) {
        if (tree == null) {
            return false;
        } else {
            if (data.compareTo(tree.getData()) == 0) {
                return true;
            } else {
                if (data.compareTo(tree.getData()) < 0) {
                    return lookup(tree.getLeft(), data);
                } else {
                    return lookup(tree.getLeft(), data);
                }
            }
        }
    }

    public boolean lookup(Comparable<E> data) {
        return lookup(this, data);
    }

    public static <E> int getMaxWidth(BinaryTree<E> tree) {
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

    public static <E> int getWidth(BinaryTree<E> tree, int level) {
        if (tree == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        }
        return getWidth(tree.getLeft(), level - 1) + getWidth(tree.getRight(), level - 1);
    }

    public static <E> int size(BinaryTree<E> tree) {
        if (tree == null) {
            return 0;
        }
        return size(tree.getLeft()) + 1 + size(tree.getRight());
    }

    public int size() {
        return size(this);
    }

    public static <E> boolean isEqual(BinaryTree<E> treeA, BinaryTree<E> treeB) {
        if (treeA == null && treeB == null) {
            return true;
        } else if (treeA != null && treeB != null) {
            return treeA.getData().equals(treeB.getData())
                && isEqual(treeA.getLeft(), treeB.getLeft())
                && isEqual(treeA.getRight(), treeB.getRight());
        }
        return false;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BinaryTree<E> getLeft() {
        return left;
    }

    public void setLeft(BinaryTree<E> left) {
        this.left = left;
    }

    public BinaryTree<E> getRight() {
        return right;
    }

    public void setRight(BinaryTree<E> right) {
        this.right = right;
    }

    public void addRight(E data) {
        this.right = new BinaryTree<>(data);
    }

    public void addLeft(E data) {
        this.left = new BinaryTree<>(data);
    }
}
