package ru.mirea.practice.s23k0690;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        try (Scanner con = new Scanner(System.in)) {
            int n = con.nextInt();
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    res += con.nextInt();
                }
            }
            res /= 2;
            System.out.println(res);
        }
    }
}
