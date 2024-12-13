package ru.mirea.practice.s23f0011;

public abstract class Tester {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Вставка узлов
        int[] nodes = {10, 20, 5, 6, 3, 30, 25, 15, 8, 18};
        for (int node : nodes) {
            tree.insert(node);
        }

        System.out.println("Дерево после вставки узлов:");
        tree.inorder();  // Выводим дерево
        System.out.println();

        // Удаление одного узла
        System.out.println("Удаляем узел 20:");
        tree.delete(20);
        tree.inorder();  // Выводим дерево после удаления
        System.out.println();

        // Очистка дерева
        System.out.println("Удаляем все узлы:");
        tree.clear();
        tree.inorder();  // Дерево после очистки
        System.out.println();
    }
}
