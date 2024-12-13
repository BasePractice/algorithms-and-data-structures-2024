package ru.mirea.practice.s23k0350.pt1;

abstract class Main30 {
    public static void main(String[] args) {
        HuffmanCoding huffmanCoding = new HuffmanCoding();
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] freq = {5, 9, 12, 13, 16, 45};

        Node root = huffmanCoding.buildHuffmanTree(chars, freq);
        huffmanCoding.printCodes(root, "");
    }
}

