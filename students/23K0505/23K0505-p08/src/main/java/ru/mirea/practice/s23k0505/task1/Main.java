package ru.mirea.practice.s23k0505.task1;

public abstract class Main {
    public static void triseq(int lastK, int currK, int printedK) {
        if (currK == lastK && currK - 1 == printedK) {
            System.out.printf("%d\n", lastK);
            return;
        } else if (printedK >= currK) {
            triseq(lastK, currK + 1, 0);
        } else {
            System.out.printf("%d, ", currK);
            triseq(lastK, currK, printedK + 1);
        }
    }

    public static void main(String[] args) {
        triseq(5, 1, 0);
    }
}
