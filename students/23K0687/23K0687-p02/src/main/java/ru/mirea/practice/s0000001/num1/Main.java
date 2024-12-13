package ru.mirea.practice.s0000001.num1;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            Fact f = new Fact();
            long result = f.calc(n);

            System.out.println(result);
        }
    }
}
