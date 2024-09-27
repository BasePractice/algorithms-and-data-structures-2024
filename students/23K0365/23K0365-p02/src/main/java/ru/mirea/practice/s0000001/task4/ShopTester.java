package ru.mirea.practice.s0000001.task4;

import java.util.Scanner;

public abstract class ShopTester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ln;
            System.out.println("How many computers do u wanna add:");
            ln = sc.nextInt();
            Shop[] qw = new Shop[ln];

            for (int i = 0; i < ln; i++) {
                System.out.println("Enter: Brand, CPU, Price, GPU");
                qw[i] = new Shop(sc.next(), sc.next(), sc.nextInt(), sc.next());
            }

            System.out.println(qw[ln - 1] + "\n---\n");

            System.out.println("Enter min price and max price:");
            for (Shop x : qw) {
                x.findExactByPrice(10, 0);
            }
            Shop addedOne = new Shop(sc.next(), sc.next(), sc.nextInt(), sc.next());
            qw = addedOne.addComp(qw, addedOne);
            for (Shop x : qw) {
                System.out.print(x);
            }
            System.out.println();
            int delNum = sc.nextInt();
            qw = qw[0].delComp(qw, delNum - 1);
            for (Shop x : qw) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
