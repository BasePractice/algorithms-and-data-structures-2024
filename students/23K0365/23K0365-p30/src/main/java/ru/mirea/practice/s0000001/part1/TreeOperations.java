package ru.mirea.practice.s0000001.part1;

import java.util.LinkedList;
import java.util.Queue;

public class TreeOperations {
    Node head;

    TreeOperations() {
        head = null;
    }

    void addElement(int info) {
        head = addingElement(head, info);
    }

    private Node addingElement(Node cur, int info) {
        if (cur == null) {
            return new Node(info);
        }
        if (info < cur.info) {
            cur.l = addingElement(cur.l, info);
        } else if (info > cur.info) {
            cur.r = addingElement(cur.r, info);
        } else {
            return cur;
        }
        return cur;
    }

    int heightDeterm(Node a) {
        if (a == null) {
            return 0;
        } else {
            int lheight = heightDeterm(a.l);
            int rheight = heightDeterm(a.r);
            return Math.max(lheight, rheight) + 1;
        }
    }

    void reveringTree(Node a) {
        if (a != null) {
            reveringTree(a.l);
            reveringTree(a.r);
            Node temp = a.l;
            a.l = a.r;
            a.r = temp;
        }
    }

    boolean searchElement(Node a, int key) {
        if (a == null) {
            return false;
        }
        if (a.info == key) {
            return true;
        }
        return searchElement(a.l, key) || searchElement(a.r, key);
    }

    int widthDeterm(Node a) {
        if (a == null) {
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(a);
        int maxx = 0;
        while (!q.isEmpty()) {
            int siz = q.size();
            maxx = Math.max(maxx, siz);
            for (int i = 0; i < siz; i++) {
                Node temp = q.poll();
                if (temp.l != null) {
                    q.offer(temp.l);
                }
                if (temp.r != null) {
                    q.offer(temp.r);
                }
            }
        }
        return maxx;
    }

    int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.l) + countNodes(node.r);
        }
    }

    boolean comparringTree(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return root1.info == root2.info
            && comparringTree(root1.l, root2.l)
            && comparringTree(root1.r, root2.r);
    }

    public static void main(String[] args) {
        TreeOperations tree = new TreeOperations();
        TreeOperations treeSc = new TreeOperations();
        for (int i = 5; i < 15; i++) {
            treeSc.addElement(i * 17 % 10);
            tree.addElement(i * 17 % 10);
        }
        treeSc.addElement(999);
        System.out.println("height: " + tree.heightDeterm(tree.head));
        System.out.println("width: " + tree.widthDeterm(tree.head));
        System.out.println("el-nt '5' exist? " + tree.searchElement(tree.head, 5));
        System.out.println("conut of el-nts: " + tree.countNodes(tree.head));

        System.out.println();
        System.out.println("second n first trees comparing:" + treeSc.comparringTree(tree.head, treeSc.head));
        System.out.println("height: " + treeSc.heightDeterm(treeSc.head));
        System.out.println("width: " + treeSc.widthDeterm(treeSc.head));
        System.out.println("count of el-nts: " + treeSc.countNodes(treeSc.head));

        System.out.println();
        TreeOperations treeTh = treeSc;
        treeSc.reveringTree(treeSc.head);
        System.out.println("second n third trees comparing:" + treeSc.comparringTree(treeTh.head, treeSc.head));

    }
}
