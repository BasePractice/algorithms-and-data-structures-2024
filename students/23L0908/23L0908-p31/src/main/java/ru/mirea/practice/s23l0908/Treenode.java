package ru.mirea.practice.s23l0908;

import java.util.ArrayList;
import java.util.List;

public class Treenode {
    private List<ProcessorRecord> records;
    private List<Treenode> children;

    public Treenode(ProcessorRecord record) {
        this.records = new ArrayList<>();
        this.children = new ArrayList<>();
        this.records.add(record);
    }

    public Treenode insert(ProcessorRecord record) {
        if (record.getKey() < records.get(0).getKey()) {
            if (!children.isEmpty()) {  // Используем isEmpty() вместо size() == 0
                Treenode leftChild = children.get(0);
                leftChild = leftChild.insert(record);
            } else {
                children.add(new Treenode(record));
            }
        } else {
            if (children.size() > 1) {  // Данный код можно оставить, так как тут проверяется наличие второго дочернего узла
                Treenode rightChild = children.get(1);
                rightChild = rightChild.insert(record);
            } else {
                children.add(new Treenode(record));
            }
        }
        return this;
    }

    public Treenode delete(int key) {
        if (contains(key)) {
            for (int i = 0; i < records.size(); i++) {
                if (records.get(i).getKey() == key) {
                    records.remove(i);
                    break;
                }
            }
        } else {
            for (Treenode child : children) {
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
        for (Treenode child : children) {
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
        for (Treenode child : children) {
            child.printTopToBottom();
        }
    }

    public final void printPostOrder() {
        for (Treenode child : children) {
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
        for (Treenode child : children) {
            child.printPreOrder();
        }
    }

    public final void printPostOrderWithLevels() {
        printPostOrderWithLevelsHelper(0);
    }

    private void printPostOrderWithLevelsHelper(int level) {
        for (Treenode child : children) {
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
        for (Treenode child : children) {
            child.printPreOrderWithLevelsHelper(level + 1);
        }
    }

    public List<ProcessorRecord> getAllRecords() {
        List<ProcessorRecord> allRecords = new ArrayList<>(records);
        for (Treenode child : children) {
            allRecords.addAll(child.getAllRecords());
        }
        return allRecords;
    }
}
