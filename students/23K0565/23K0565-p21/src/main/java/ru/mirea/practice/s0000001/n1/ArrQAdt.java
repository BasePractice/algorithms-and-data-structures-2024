package ru.mirea.practice.s0000001.n1;

public class ArrQAdt {
    private Object[] q;
    private int fr;
    private int rr;
    private int sz;

    public ArrQAdt(int cap) {
        q = new Object[cap];
        fr = 0;
        rr = 0;
        sz = 0;
    }

    public static void add(ArrQAdt queue, Object el) {
        queue.ensureCap();
        queue.q[queue.rr] = el;
        queue.rr = (queue.rr + 1) % queue.q.length;
        queue.sz++;
    }

    public static Object peek(ArrQAdt queue) {
        if (queue.sz > 0) {
            return queue.q[queue.fr];
        } else {
            return null;
        }
    }

    public static Object poll(ArrQAdt queue) {
        if (queue.sz == 0) {
            return null;
        }
        final Object el = queue.q[queue.fr];
        queue.q[queue.fr] = null;
        queue.fr = (queue.fr + 1) % queue.q.length;
        queue.sz--;
        return el;
    }

    public static int size(ArrQAdt queue) {
        return queue.sz;
    }

    public static boolean isEmpty(ArrQAdt queue) {
        return queue.sz == 0;
    }

    public static void clear(ArrQAdt queue) {
        queue.q = new Object[queue.q.length];
        queue.fr = 0;
        queue.rr = 0;
        queue.sz = 0;
    }

    private void ensureCap() {
        if (sz == q.length) {
            Object[] nq = new Object[q.length * 2];
            for (int i = 0; i < sz; i++) {
                nq[i] = q[(fr + i) % q.length];
            }
            fr = 0;
            rr = sz;
            q = nq;
        }
    }
}
