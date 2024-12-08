package ru.mirea.practice.s00000030.task1;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        System.out.println("Создаем бинарное дерево из 12 узлов:");
        tree.insert(12);
        tree.insert(34);
        tree.insert(43);
        tree.insert(21);
        tree.insert(45);
        tree.insert(67);
        tree.insert(87);
        tree.insert(89);
        tree.insert(99);
        tree.insert(40);
        tree.insert(29);
        tree.insert(18);
        System.out.println("Дерево после вставки узлов:");
        tree.printInOrder();

        System.out.println("\nУдаляем узел со значением 43.");
        tree.delete(43);
        System.out.println("Дерево после удаления узла 43:");
        tree.printInOrder();

        System.out.println("\nОчищаем дерево.");
        tree.clear();
        if (tree.isEmpty()) {
            System.out.println("Дерево успешно удалено.");
        } else {
            System.out.println("Ошибка при удалении дерева.");
        }
    }
}
