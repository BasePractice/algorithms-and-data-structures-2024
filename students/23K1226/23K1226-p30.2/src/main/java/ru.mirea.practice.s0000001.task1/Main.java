package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BinaryTree tree = new BinaryTree();
            System.out.println("Введите 10 элементов для бинарного дерева (через пробел):");
            String line = scanner.nextLine();
            String[] elements = line.split(" ");
            for (String element : elements) {
                int value = Integer.parseInt(element);
                tree.insert(value);
            }

            System.out.println("Содержимое дерева (in-order):");
            tree.inorder();
            System.out.println();

            System.out.println("Введите значение узла для удаления:");
            int deleteValue = scanner.nextInt();
            tree.delete(deleteValue);

            System.out.println("Содержимое дерева после удаления (in-order):");
            tree.inorder();
            System.out.println();

            System.out.println("Удаление дерева...");
            tree.clear();
            System.out.println("Дерево полностью удалено.");
        }
    }
}
