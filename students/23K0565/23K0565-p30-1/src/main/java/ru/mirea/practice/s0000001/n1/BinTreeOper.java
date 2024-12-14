package ru.mirea.practice.s0000001.n1;

import java.util.PriorityQueue;

public class BinTreeOper {
    Node root;

    int height(Node n) {
        if (n == null) {
            return 0;
        }
        return Math.max(height(n.left), height(n.right)) + 1;
    }

    boolean lookup(Node n, int target) {
        if (n == null) {
            return false;
        }
        if (n.data == target) {
            return true;
        }
        if (target < n.data) {
            return lookup(n.left, target);
        } else {
            return lookup(n.right, target);
        }
    }

    void reverse(Node n) {
        if (n == null) {
            return;
        }
        Node tmp = n.left;
        n.left = n.right;
        n.right = tmp;
        reverse(n.left);
        reverse(n.right);
    }

    int maxWidth(Node n) {
        int maxW = 0;
        int h = height(n);
        for (int i = 1; i <= h; i++) {
            int w = getWidth(n, i);
            if (w > maxW) {
                maxW = w;
            }
        }
        return maxW;
    }

    int getWidth(Node n, int lvl) {
        if (n == null) {
            return 0;
        }
        if (lvl == 1) {
            return 1;
        }
        return getWidth(n.left, lvl - 1) + getWidth(n.right, lvl - 1);
    }

    int size(Node n) {
        if (n == null) {
            return 0;
        }
        return size(n.left) + 1 + size(n.right);
    }

    boolean sameTree(Node a, Node b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b != null) {
            return a.data == b.data && sameTree(a.left, b.left) && sameTree(a.right, b.right);
        }
        return false;
    }

    static HuffmanN buildHuffTree(int[] freqs) {
        PriorityQueue<HuffmanN> pq = new PriorityQueue<>((a, b) -> a.freq - b.freq);
        for (int f : freqs) {
            pq.add(new HuffmanN(f));
        }

        while (pq.size() > 1) {
            HuffmanN a = pq.poll();
            HuffmanN b = pq.poll();
            HuffmanN sum = new HuffmanN(a.freq + b.freq);
            sum.left = a;
            sum.right = b;
            pq.add(sum);
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        BinTreeOper tree = new BinTreeOper();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(4);

        System.out.println("Высота дерева: " + tree.height(tree.root));
        System.out.println("Поиск 4: " + tree.lookup(tree.root, 4));
        System.out.println("Ширина дерева: " + tree.maxWidth(tree.root));
        System.out.println("Количество узлов: " + tree.size(tree.root));

        int[] freqs = {2, 3, 5, 7, 11, 13, 17};
        HuffmanN root = buildHuffTree(freqs);
        System.out.println("Корень дерева Хаффмана: " + root.freq);
    }
}
