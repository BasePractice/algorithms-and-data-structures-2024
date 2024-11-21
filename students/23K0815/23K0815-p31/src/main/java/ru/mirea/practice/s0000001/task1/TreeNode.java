package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    List<Integer> keys;
    List<TreeNode> children;

    public TreeNode(int key) {
        keys = new ArrayList<>();
        keys.add(key);
        children = new ArrayList<>();
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }
}
