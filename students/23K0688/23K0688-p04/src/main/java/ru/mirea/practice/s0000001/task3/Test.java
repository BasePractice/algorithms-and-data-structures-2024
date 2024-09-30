package ru.mirea.practice.s0000001.task3;

import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        System.out.println("Welcome,enter 0 for tutorial");
        Wares[] list = new Wares[10];
        Shop2 shop2 = new Shop2();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter your action:");
                int action = sc.nextInt();
                switch (action) {
                    case 0:
                        shop2.tutorial();
                        break;
                    case 1:
                        shop2.printCatalogues();
                        break;
                    case 2:
                        System.out.println("Enter Catalogue:");
                        shop2.printwares(Catalogue.valueOf(sc.next()));
                        break;
                    case 3:
                        System.out.println("Enter Goods(type stop to stop):");
                        String stopper = "";
                        while (true) {
                            stopper = sc.next();
                            if ("stop".equals(stopper)) {
                                break;
                            } else {
                                System.out.println("Enter next Goods:");
                            }
                            Wares ware = Wares.valueOf(stopper);
                            list = shop2.addtolist(list,ware);
                        }
                        break;
                    case 4:
                        shop2.listlist(list);
                        break;
                    case 5:
                        int sum = shop2.suml(list);
                        System.out.println("To deposit : " + sum);
                        System.out.println("scan your card");
                        int money = sc.nextInt();
                        money = shop2.checker(money,sum);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
