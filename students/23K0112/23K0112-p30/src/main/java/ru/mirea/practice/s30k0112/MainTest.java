package ru.mirea.practice.s30k0112;

import static ru.mirea.practice.s30k0112.Huffman.buildHuffmanTree;

public final class MainTest {
    private MainTest() {

    }

    public static void main(String[] args) {
        String text = "Test";

        buildHuffmanTree(text);
    }
}
