package ru.mirea.practice.s0000001.n1;

class Comx {
    private int r;
    private int i;

    public Comx() {
        this.r = 0;
        this.i = 0;
    }

    public Comx(int r, int i) {
        this.r = r;
        this.i = i;
    }

    @Override
    public String toString() {
        return "Comx{"
            +
            "r=" + r
            +
            ", i=" + i
            +
            '}';
    }
}
