package ru.mirea.practice.s0000001.task4;

import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        try (Scanner sc1 = new Scanner(System.in)) {
            Pc[] p1 = new Pc[2];
            p1[0] = new Pc("g", "c", "r", "o", "o");
            System.out.println(p1[0]);
            System.out.println("Welcome,enter 0 for tutorial");
            Shop shop = new Shop();
            int action = 0;
            while (action != 7) {
                action = sc1.nextInt();
                switch (action) {
                    case 0:
                        shop.tutorial();
                        break;
                    case 1:
                        shop.listpcs(p1);
                        break;
                    case 2:
                        System.out.println("input gpu,cpu,ram,os,origin");
                        p1 = shop.setPc(p1,sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
                        System.out.println("computer added");
                        break;
                    case 3:
                        System.out.println("input number");
                        p1 = shop.delPc(p1, sc1.nextInt());
                        break;
                    case 4:
                        System.out.println("input criteria");
                        shop.search(p1, sc1.nextLine());
                        break;
                    case 5:
                        System.out.println("input number");
                        System.out.println(shop.getPc(p1, sc1.nextInt()));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
