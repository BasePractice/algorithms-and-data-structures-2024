package ru.mirea.practice.s23k0143;

public abstract class TestBinaryTree {
    public static void main(String[] args) {

        //Задание 1
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new Node(10);
        tree1.root.left = new Node(5);
        tree1.root.right = new Node(20);

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new Node(10);
        tree2.root.left = new Node(5);
        tree2.root.right = new Node(20);

        boolean areSame = tree1.sameTree(tree1.root, tree2.root);
        System.out.println("Проверка на одинаковые деревья: " + areSame);

        // Задание 2
        Huffman huffmanCode = new Huffman();
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
        int[] charFreq = { 12, 4, 15, 8, 25 };
        huffmanCode.huffmanAlgorithm(charArray, charFreq);
    }
}
