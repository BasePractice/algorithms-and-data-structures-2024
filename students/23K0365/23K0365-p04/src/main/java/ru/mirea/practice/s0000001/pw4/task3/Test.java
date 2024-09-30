package ru.mirea.practice.s23k0362.pw4.task3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        User u = new User(1, 1);
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart(new ViewList[0], 0);
        if (u.tryEnter()) {
            ViewList[] a = {
                Dishes.PLATES,
                Dishes.SPOONS,
                Dishes.FORKS,
                Gadjets.TV,
                Gadjets.CHARGER,
                Gadjets.SMARTPHONE
            };
            System.out.println("Type ur action:\n1.See gadjets\t2.See dishes\t3.See all\n");
            ViewList[] b = new ViewList[3];

            switch (sc.nextInt()) {
                case 1:
                    for (Gadjets x: Gadjets.values()) {
                        System.out.printf("Name: " + x.name() + "\t" +
                                x.getDescription() + "\tPrice: " +
                                x.getPrice() + "\n");
                    }
                    System.out.println("What u want to add?");
                    String choise2 = sc.next();
                    cart.addSmth(cart, Gadjets.valueOf(choise2));
                    break;
                case 2:
                    for (Dishes x: Dishes.values()) {
                        System.out.printf("Name: " + x.name() + "\t" +
                                x.getDescription() + "\tPrice: " +
                                x.getPrice() + "\n");
                    }
                    System.out.println("What u want to add?");
                    choise2 = sc.next();
                    cart.addSmth(cart, Gadjets.valueOf(choise2));
                    break;
                case 3:
                    for (ViewList x: a) {
                        x.print();
                    }
                    System.out.println("What u want to add? Enter number: ");
                    int choise3 = sc.nextInt();
                    cart.addSmth(cart, a[choise3 - 1]);
                    break;
                default: break;
            }
            System.out.println(Gadjets.TV.getCount());
            System.out.println(cart);
        }
    }
}