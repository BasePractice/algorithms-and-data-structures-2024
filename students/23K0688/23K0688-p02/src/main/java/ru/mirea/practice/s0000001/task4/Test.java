package ru.mirea.practice.s0000001.task4;

import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Pc[] p1 = new Pc[2];
            p1[0] = new Pc("g", "c", "r", "o", "o");
            System.out.println(p1[0]);
            System.out.println("Welcome,enter 0 for tutorial");
            Shop shop = new Shop();
            while (true) {
                int action = sc.nextInt();
                switch (action) {
                    case 0:
                        shop.tutorial();
                        break;
                    case 1:

                        break;
                    case 2:
                        p1 = shop.setPc(p1);
                        break;
                    case 3:
                        p1 = shop.delPc(p1);
                        break;
                    case 4:
                        shop.search(p1);
                        break;
                    case 5:
                        System.out.println(shop.getPc(p1));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
