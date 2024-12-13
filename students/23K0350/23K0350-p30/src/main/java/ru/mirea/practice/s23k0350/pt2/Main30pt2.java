package ru.mirea.practice.s23k0350.pt2;

abstract class Main30pt2 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] keys = {20, 10, 30, 5, 15, 25, 35, 1, 12, 27};
        for (int key : keys) {
            bst.insert(key);
        }

        System.out.println("Содержимое дерева (в порядке):");
        bst.inorder();

        bst.root = bst.deleteNode(bst.root, 15);
        System.out.println("После удаления узла со значением 15:");
        bst.inorder();

        bst.clear();
        System.out.println("Дерево полностью очищено.");
    }
}
