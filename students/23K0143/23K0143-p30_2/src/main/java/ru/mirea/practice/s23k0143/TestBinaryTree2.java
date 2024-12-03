package ru.mirea.practice.s23k0143;

public abstract class TestBinaryTree2 {
    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();

        int[] nodes = {50, 30, 20, 40, 70, 60, 80, 10, 90, 5};
        for (int node : nodes) {
            tree.insert(node);
        }

        // Печать содержимого дерева
        System.out.println("Содержимое дерева в сортированном порядке:");
        tree.inorder();

        // Удаление одного узла
        int keyToDelete = 70;
        System.out.println("Удаление узла с ключом: " + keyToDelete);
        tree.delete(keyToDelete);

        // Печать после удаления узла
        System.out.println("Содержимое дерева после удаления узла:");
        tree.inorder();

        // Полное удаление дерева
        tree.destroyTree();
        System.out.println("Дерево было успешно удалено.");
    }
}

