package ru.mirea.practice.s0000001.part2;

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

    void deleteElement(int info) {
        head = deletingElement(head, info);
    }

    private Node deletingElement(Node cur, int info) {
        if (cur == null) {
            return null;
        }
        if (info == cur.info) {
            if (cur.l == null && cur.r == null) {
                return null;
            }
            if (cur.r == null) {
                return cur.l;
            }
            if (cur.l == null) {
                return cur.r;
            }
            int smValue = findSmallest(cur.r);
            cur.info = smValue;
            cur.r = deletingElement(cur.r, smValue);
            return cur;
        }
        if (info < cur.info) {
            cur.l = deletingElement(cur.l, info);
            return cur;
        } else {
            cur.r = deletingElement(cur.r, info);
            return cur;
        }
    }

    private int findSmallest(Node head) {
        return head.l == null ? head.info : findSmallest(head.l);
    }

    private int findBiggest(Node head) {
        return head.r == null ? head.info : findBiggest(head.r);
    }

    void printTree() {
        if (head == null) {
            System.out.println("its empty(");
            return;
        }
        int height = heightDeterm(head);
        Queue<Node> q = new LinkedList<>();
        q.add(head);
        Queue<String> path = new LinkedList<>();
        path.add("");
        while (!q.isEmpty()) {
            int level = q.size();
            for (int i = 0; i < level; i++) {
                Node temp = q.poll();
                String curPath = path.poll();
                System.out.print(curPath + temp.info);
                if (temp.l != null) {
                    q.add(temp.l);
                    path.add(curPath);
                }
                if (temp.r != null) {
                    q.add(temp.r);
                    path.add(curPath + "   ");
                    for (int j = 0; j < height - level; j++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
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

    void deleteWholeTree() {
        head = null;
    }

    public static void main(String[] args) {
        TreeOperations tree = new TreeOperations();
        for (int i = 5; i < 16; i++) {
            tree.addElement(i * 17 % 10);
        }
        tree.printTree();
        System.out.println("smallest - " + tree.findSmallest(tree.head));
        System.out.println("biggest - " + tree.findBiggest(tree.head));
        System.out.println("delete - 9\n");
        tree.deleteElement(9);
        tree.printTree();
        tree.deleteWholeTree();
        tree.printTree();
    }
}
