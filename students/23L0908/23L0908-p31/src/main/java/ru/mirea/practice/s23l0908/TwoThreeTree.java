package ru.mirea.practice.s23l0908;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TwoThreeTree {
    private Treenode root;

    public void insert(ProcessorRecord record) {
        if (root == null) {
            root = new Treenode(record);
        } else {
            root = root.insert(record);
        }
    }

    public void delete(int key) {
        if (root != null) {
            root = root.delete(key);
        }
    }

    public boolean contains(int key) {
        return root != null && root.contains(key);
    }

    public void print(int variant) {
        if (root == null) {
            System.out.println("Дерево пустое.");
            return;
        }
        switch (variant) {
            case 1:
                root.printBottomToTop();
                break;
            case 2:
                root.printTopToBottom();
                break;
            case 3:
                root.printPostOrder();
                break;
            case 4:
                root.printPreOrder();
                break;
            case 5:
                root.printPostOrderWithLevels();
                break;
            case 6:
                root.printPreOrderWithLevels();
                break;
            default:
                System.out.println("Неверный вариант.");
                break;  // Добавлен break
        }
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            if (root != null) {
                List<ProcessorRecord> records = root.getAllRecords();
                for (ProcessorRecord record : records) {
                    writer.write(record.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
