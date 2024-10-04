package ru.mirea.practice.s23k0505.task9;

public abstract class Main {
    public static int numOfSeq(int zeros, int ones, char prev) {
        if (zeros == 1) {
            if (prev == '0' && ones == 0) {
                return 0;
            } else {
                return 1;
            }
        }
        return numOfSeq(zeros - 1, ones, '0') + numOfSeq(zeros - 1, ones, '1');
    }

    public static void main(String[] args) {
        System.out.println(numOfSeq(3, 3, '1') + numOfSeq(3, 3, '0'));
    }
}
