package ru.mirea.practice.s0000001;

public abstract class TaskTwo {
    public static void nnums(int n, int r) {
        if (n != r) {
            System.out.println(r);
            nnums(n,r + 1);
        }
    }



    public static void main(String[] args) {
        nnums(15,0);
    }
}
