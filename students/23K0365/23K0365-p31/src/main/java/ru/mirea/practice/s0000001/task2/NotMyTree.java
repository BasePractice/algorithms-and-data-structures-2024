package ru.mirea.practice.s0000001.task2;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class NotMyTree {
    public static void printer(Node head) {
        if (head == null) {
            return;
        }
        int leng = getHeight(head);
        Deque<Node> q = new ArrayDeque<>();
        q.offer(head);
        String result = "";
        for (int level = 1; level <= leng; level++) {
            int size = q.size();
            String currentLevelNodes = "";
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                currentLevelNodes += node.data;
                if (i < size - 1) {
                    currentLevelNodes += ", ";
                }
                for (int j = 0; j < node.childCnt; j++) {
                    if (node.childs[j] != null) {
                        q.offer(node.childs[j]);
                    }
                }
            }
            result += currentLevelNodes + ", ";
        }

        if (result.length() > 0) {
            result = result.substring(0, result.length() - 2);
        }
        System.out.println(result);
    }

    private static int getHeight(Node head) {
        if (head == null) {
            return 0;
        }
        int leng = 1;
        for (int i = 0; i < head.childCnt; i++) {
            if (head.childs[i] != null) {
                leng = Math.max(leng, 1 + getHeight(head.childs[i]));
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
