package ru.mirea.practice.s23k0505.task2;

import ru.mirea.practice.s23k0505.task1.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public abstract class Huffman {
    // This is the worst code I've ever written
    // but I don't have time to rewrite it

    public static <E> BinaryTree<DataFreq<?>> huffman(List<DataFreq<E>> elements) {
        PriorityQueue<DataFreq<?>> queue = new PriorityQueue<>();
        for (DataFreq<E> element : elements) {
            queue.add(new DataFreq<>(new BinaryTree(element.getData()), element.getFrequency()));
        }
        while (queue.size() != 1) {
            DataFreq<?> el1 = queue.poll();
            DataFreq<?> el2 = queue.poll();
            BinaryTree<DataFreq<?>> tempTree = new BinaryTree<>();
            if (el1.compareTo(el2) <= 0) {
                tempTree.addLeft(el1);
                tempTree.addRight(el2);
            } else {
                tempTree.addLeft(el2);
                tempTree.addRight(el1);
            }
            queue.add(new DataFreq<>(tempTree, el1.getFrequency() + el2.getFrequency()));
        }
        return new BinaryTree<>(queue.poll());
    }

    public static <E> void makeHuffmanCodesMap(String code, Map<E, String> map, BinaryTree<?> tree) {
        if (tree.getData() instanceof DataFreq) {
            tree = (BinaryTree<?>) ((DataFreq) tree.getData()).getData();
        }
        if (tree.getLeft() != null) {
            makeHuffmanCodesMap(code + "0", map, tree.getLeft());
        }
        if (tree.getLeft() != null) {
            makeHuffmanCodesMap(code + "1", map, tree.getRight());
        }
        if (tree.getLeft() == null && tree.getRight() == null) {
            map.put((E) tree.getData(), code);
        }
    }

    public static <E> void makeHuffmanCodesMap(Map<E, String> map, BinaryTree<?> tree) {
        makeHuffmanCodesMap("", map, tree);
    }

    public static void main(String[] args) {
        List<DataFreq<Character>> charFreq = new ArrayList<>();
        charFreq.add(new DataFreq<>('a', 5));
        charFreq.add(new DataFreq<>('b', 9));
        charFreq.add(new DataFreq<>('c', 12));
        charFreq.add(new DataFreq<>('d', 13));
        charFreq.add(new DataFreq<>('e', 16));
        charFreq.add(new DataFreq<>('f', 45));
        BinaryTree<?> tree = huffman(charFreq);
        HashMap<Character, String> map = new HashMap<>();
        makeHuffmanCodesMap(map, tree);
        System.out.println(map);
    }
}
