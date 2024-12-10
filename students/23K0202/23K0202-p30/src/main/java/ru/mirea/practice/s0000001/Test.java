package ru.mirea.practice.s0000001;

public abstract class Test {
    public static void main(String[] args) {

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Nodee(5);
        tree1.root.left = new Nodee(10);
        tree1.root.right = new Nodee(15);

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Nodee(5);
        tree2.root.left = new Nodee(10);
        tree2.root.right = new Nodee(15);

        boolean areSame = tree1.sameTree(tree1.root, tree2.root);
        System.out.println("Проверка на одинаковые деревья: " + areSame);



    }
}
