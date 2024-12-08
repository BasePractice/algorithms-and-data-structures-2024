package ru.mirea.practice.s23k0155;

public abstract class Test {
    public static void main(String[] args) {
        System.out.println("Первое дерево:");
        Node root = new Node(10);
        BinaryTree tree1 = new BinaryTree(root);
        tree1.add(15);
        tree1.add(2);
        tree1.add(9);
        tree1.printTree();
        System.out.println("Высота дероева: " + tree1.height(root));
        System.out.println("Макимальная ширина дероева: " + tree1.getMaxWidth(root));
        tree1.reverse(root);
        System.out.println("Реверсированное дерево");
        tree1.printTree();


    }
}
