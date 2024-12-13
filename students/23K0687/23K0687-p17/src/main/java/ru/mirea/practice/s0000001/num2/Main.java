package ru.mirea.practice.s0000001.num2;

public class Main {
    static class N {
        int d;
        N p;
        N n;

        N(int d) {
            this.d = d;
        }
    }

    N h;
    N t;

    void add(int d) {
        N nw = new N(d);
        if (h == null) {
            h = nw;
            t = nw;
            h.p = null;
            t.n = null;
        } else {
            t.n = nw;
            nw.p = t;
            t = nw;
            t.n = null;
        }
    }

    void printList() {
        N n = h;
        while (n != null) {
            System.out.print(n.d + " ");
            n = n.n;
        }
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.add(3);
        list.add(5);
        list.add(1);
        System.out.println("Элементы двусвязного списка:");
        list.printList();
    }
}
