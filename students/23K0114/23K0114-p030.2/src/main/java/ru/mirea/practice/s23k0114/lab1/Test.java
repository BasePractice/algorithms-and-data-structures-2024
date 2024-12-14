package ru.mirea.practice.s23k0114.lab1;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] nodes = {5, 4, 3, 2, 1, 6, 7, 8, 9, 10};
        for (int node : nodes) {
            tree.insert(node);
        }

        System.out.println("Содержимое дерева в сортированном порядке:");
        tree.inorder();

        int keyToDelete = 5;
        System.out.println("Удаление узла: " + keyToDelete);
        tree.delete(keyToDelete);

        System.out.println("Содержимое дерева после удаления узла:");
        tree.inorder();

        tree.destroyTree();
        System.out.println("Полное удаление дерева.");
    }
}
