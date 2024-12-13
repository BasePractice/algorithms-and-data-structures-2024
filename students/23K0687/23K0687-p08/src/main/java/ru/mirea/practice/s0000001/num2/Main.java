package ru.mirea.practice.s0000001.num2;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
