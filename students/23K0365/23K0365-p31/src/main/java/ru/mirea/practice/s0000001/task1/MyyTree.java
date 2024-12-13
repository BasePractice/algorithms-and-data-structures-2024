package ru.mirea.practice.s0000001.task1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public abstract class MyyTree {
    public static void printer(Node head) {
        if (head == null) {
            return;
        }
        int leng = getHeight(head);
        List<String> levels = new ArrayList<>();
        Deque<Node> q = new ArrayDeque<>();
        q.offer(head);
        for (int level = 0; level < leng; level++) {
            int size = q.size();
            int b4 = (int) Math.pow(2, leng - level - 1) - 1;
            int betwen = (int) Math.pow(2, leng - level) - 1;
            StringBuilder answ = new StringBuilder(" ".repeat(b4));
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                answ.append(node.data);
                if (i < size - 1) {
                    answ.append(" ".repeat(betwen));
                }
                for (int j = 0; j < node.childCnt; j++) {
                    q.offer(node.childs[j]);
                }
            }
            levels.add(answ.toString());
        }
        for (int i = levels.size() - 1; i >= 0; i--) {
            System.out.println(levels.get(i));
        }
    }

    private static int getHeight(Node head) {
        if (head == null) {
            return 0;
        }
        int leng = 0;
        Deque<Node> q = new ArrayDeque<>();
        q.offer(head);
        while (!q.isEmpty()) {
            int size = q.size();
            leng++;
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                for (int j = 0; j < node.childCnt; j++) {
                    q.offer(node.childs[j]);
                }
            }
        }
        return leng;
    }

    public static void main(String[] args) {
        Node main = new Node(5);
        Node a = new Node(2);
        Node b = new Node(6);
        Node c = new Node(1);
        final Node d = new Node(2);
        final Node e = new Node(5);
        final Node f = new Node(6);
        main.addChild(a);
        main.addChild(b);
        a.addChild(c);
        a.addChild(d);
        b.addChild(e);
        b.addChild(f);
        printer(main);
    }
}
