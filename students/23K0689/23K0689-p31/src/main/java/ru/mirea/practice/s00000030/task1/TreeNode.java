package ru.mirea.practice.s00000030.task1;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    private List<ProcessorRecord> records;
    private List<TreeNode> children;

    public TreeNode(ProcessorRecord record) {
        this.records = new ArrayList<>();
        this.children = new ArrayList<>();
        this.records.add(record);
    }

    public TreeNode insert(ProcessorRecord record) {
        if (record.getKey() < records.get(0).getKey()) {
            if (!children.isEmpty()) {  // Используем isEmpty() вместо size() == 0
                TreeNode leftChild = children.get(0);
                leftChild = leftChild.insert(record);
            } else {
                children.add(new TreeNode(record));
            }
        } else {
            if (children.size() > 1) {  // Данный код можно оставить, так как тут проверяется наличие второго дочернего узла
                TreeNode rightChild = children.get(1);
                rightChild = rightChild.insert(record);
            } else {
                children.add(new TreeNode(record));
            }
        }
        return this;
    }

    public TreeNode delete(int key) {
        if (contains(key)) {
            for (int i = 0; i < records.size(); i++) {
                if (records.get(i).getKey() == key) {
                    records.remove(i);
                    break;
                }
            }
        } else {
            for (TreeNode child : children) {
                child.delete(key);
            }
        }
        return this;
    }

    public boolean contains(int key) {
        for (ProcessorRecord record : records) {
            if (record.getKey() == key) {
                return true;
            }
        }
        for (TreeNode child : children) {
            if (child.contains(key)) {
                return true;
            }
        }
        return false;
    }

    public final void printBottomToTop() {
        for (int i = children.size() - 1; i >= 0; i--) {
            children.get(i).printBottomToTop();
        }
        for (ProcessorRecord record : records) {
            System.out.println(record);
        }
    }

    public final void printTopToBottom() {
        for (ProcessorRecord record : records) {
            System.out.println(record);
        }
        for (TreeNode child : children) {
            child.printTopToBottom();
        }
    }

    public final void printPostOrder() {
        for (TreeNode child : children) {
            child.printPostOrder();
        }
        for (ProcessorRecord record : records) {
            System.out.println(record);
        }
    }

    public final void printPreOrder() {
        for (ProcessorRecord record : records) {
            System.out.println(record);
        }
        for (TreeNode child : children) {
            child.printPreOrder();
        }
    }

    public final void printPostOrderWithLevels() {
        printPostOrderWithLevelsHelper(0);
    }

    private void printPostOrderWithLevelsHelper(int level) {
        for (TreeNode child : children) {
            child.printPostOrderWithLevelsHelper(level + 1);
        }
        for (ProcessorRecord record : records) {
            System.out.println("Level " + level + ": " + record);
        }
    }

    public final void printPreOrderWithLevels() {
        printPreOrderWithLevelsHelper(0);
    }

    private void printPreOrderWithLevelsHelper(int level) {
        for (ProcessorRecord record : records) {
            System.out.println("Level " + level + ": " + record);
        }
        for (TreeNode child : children) {
            child.printPreOrderWithLevelsHelper(level + 1);
        }
    }

    public List<ProcessorRecord> getAllRecords() {
        List<ProcessorRecord> allRecords = new ArrayList<>(records);
        for (TreeNode child : children) {
            allRecords.addAll(child.getAllRecords());
        }
        return allRecords;
    }
}
