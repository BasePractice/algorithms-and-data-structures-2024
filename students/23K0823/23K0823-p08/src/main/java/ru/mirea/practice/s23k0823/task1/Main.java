package ru.mirea.practice.s23k0823.task1;

public abstract class Main {
    public static void main(String[] args) {
        printSequence(10);
    }

    private static void printSequence(int n) {
        int current = 1;
        int count = 1;
        int i = 0;
        while (i < n) {
            for (int j = 0; j < count; j++) {
                System.out.print(current + " ");
                i++;
                if (i == n) {
                    break;
                }
            }
            current++;
            count++;
        }
    }
}
