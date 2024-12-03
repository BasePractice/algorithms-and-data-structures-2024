package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Task16 {
    public static void main(String[] args) {
        maxer(0,0);
    }

    public static void maxer(int max,int cnt) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("max is - " + max + ",cnt = " + cnt);
            } else {
                if (n > max) {
                    maxer(n, 1);
                } else if (n == max) {
                    maxer(max, cnt += 1);
                } else {
                    maxer(max,cnt);
                }
            }
        }
    }
}
