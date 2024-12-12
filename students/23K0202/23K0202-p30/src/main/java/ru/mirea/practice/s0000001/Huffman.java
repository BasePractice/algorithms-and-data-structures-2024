package ru.mirea.practice.s0000001;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

abstract class Huffman {
    // Обход дерева Хаффмана и сохранение кодов Хаффмана в карту.
    public static void encode(Node root, String str,
                              Map<Character, String> huffmanCode) {
        if (root == null) {
            return;
        }
        // Найден листовой узел
        if (root.left == null && root.right == null) {
            huffmanCode.put(root.ch, str);
        }


        encode(root.left, str + "0", huffmanCode);
        encode(root.right, str + "1", huffmanCode);
    }

    // Обход дерева Хаффмана и декодирование закодированной строки
    public static int decode(Node root, int index, StringBuilder sb) {
        if (root == null) {
            return index;
        }
        // Найден листовой узел
        if (root.left == null && root.right == null) {
            System.out.print(root.ch);
            return index;
        }

        index++;

        if (sb.charAt(index) == '0') {
            index = decode(root.left, index, sb);
        } else {
            index = decode(root.right, index, sb);
        }
        return index;
    }

    // Строит дерево Хаффмана и декодирует данный входной текст
    public static void buildHuffmanTree(String text) {
        // Подсчет частоты появления каждого символа и сохранение его в карту
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!freq.containsKey(text.charAt(i))) {
                freq.put(text.charAt(i), 0);
            }
            freq.put(text.charAt(i), freq.get(text.charAt(i)) + 1);
        }

        // Создаем приоритетную очередь для хранения активных узлов дерева Хаффмана
        // элемент с наивысшим приоритетом имеет наименьшую частоту
        PriorityQueue<Node> pq = new PriorityQueue<>(
            Comparator.comparingInt(l -> l.freq));

        // Создаем листовой узел для каждого символа и добавить его в приоритетную очередь.
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Делать до тех пор, пока в очереди не останется более одного узла
        while (pq.size() != 1) {
            // Удалить два узла с наивысшим приоритетом (с наименьшей частотой) из очереди
            Node left = pq.poll();
            Node right = pq.poll();

            // Создаем новый внутренний узел с этими двумя узлами в качестве дочерних и с частотой, равной сумме частот двух узлов.
            // Добавляем новый узел в приоритетную очередь.

            assert left != null;
            assert right != null;
            int sum = left.freq + right.freq;
            pq.add(new Node('\0', sum, left, right));
        }

        // root - указатель на корень дерева Хаффмана
        Node root = pq.peek();

        // Обход дерева Хаффмана и хранение кодов Хаффмана в карте
        Map<Character, String> huffmanCode = new HashMap<>();
        encode(root, "", huffmanCode);

        System.out.println("Huffman Codes are :\n");
        for (Map.Entry<Character, String> entry : huffmanCode.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\nOriginal string was :\n" + text);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            sb.append(huffmanCode.get(text.charAt(i)));
        }

        System.out.println("\nEncoded string is :\n" + sb);

        // Снова проходим по дереву Хаффмана и на этот раз декодируем закодированную строку
        int index = -1;
        System.out.println("\nDecoded string is: \n");
        while (index < sb.length() - 2) {
            index = decode(root, index, sb);
        }
    }

    public static void main(String[] args) {
        String text = "I love RTU MIREA <3";

        buildHuffmanTree(text);
    }
}


