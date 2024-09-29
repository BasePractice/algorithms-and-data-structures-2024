package ru.mirea.practice.s23k0093;

class Fact {
    private final int val;

    public Fact(int val) {
        this.val = val;
    }

    public int factorial() {
        int res = 1;
        for (int i = 1; i < val + 1; i++) {
            res = res * i;
        }
        return res;
    }
}
