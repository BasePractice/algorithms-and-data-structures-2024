package ru.mirea.practice.s23k0135;

public class BinarySearchTree {
    Node root;

    // Вставка узла в дерево
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Вывод дерева (в порядке возрастания)
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Удаление узла из дерева
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            // Узел найден

            // Узел с одним или нулевым дочерним элементом
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Узел с двумя дочерними элементами: получить минимальный элемент из правого поддерева
            root.data = minValue(root.right);

            // Удалить минимальный элемент из правого поддерева
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    // Метод для получения минимального значения в дереве
    private int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    // Очистка дерева (рекурсивное удаление всех узлов)
    public void clear() {
        root = clearRec(root);
    }

    private Node clearRec(Node root) {
        if (root != null) {
            root.left = clearRec(root.left);
            root.right = clearRec(root.right);
            root = null;  // Удаляем узел
        }
        return root;
    }
}
