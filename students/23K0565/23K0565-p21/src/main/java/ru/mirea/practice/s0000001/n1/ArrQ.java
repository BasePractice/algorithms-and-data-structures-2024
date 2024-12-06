package ru.mirea.practice.s0000001.n1;

public class ArrQ {
    private Object[] q;
    private int fr;
    private int rr;
    private int sz;

    public ArrQ(int cap) {
        q = new Object[cap];
        fr = 0;
        rr = 0;
        sz = 0;
    }

    public void add(Object el) {
        ensureCap();
        q[rr] = el;
        rr = (rr + 1) % q.length;
        sz++;
    }

    public Object peek() {
        return sz > 0 ? q[fr] : null;
    }

    public Object poll() {
        if (sz == 0) {
            return null;
        }
        final Object el = q[fr];
        q[fr] = null;
        fr = (fr + 1) % q.length;
        sz--;
        return el;
    }

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return sz == 0;
    }

    public void clear() {
        q = new Object[q.length];
        fr = 0;
        rr = 0;
        sz = 0;
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
