package ru.mirea.practice.s0000001.pw4.task3;

import java.util.Scanner;

public abstract class TestGoods {
    public static void main(String[] args) {
        User u = new User(1, 1);
        try (Scanner sc = new Scanner(System.in)) {
            Cart cart = new Cart(new Goods[0], 0);
            if (u.tryEnter()) {
                System.out.println("Type ur action:\n1.See gadjets\t2.See dishes\t3.See all\n");

                switch (sc.nextInt()) {
                    case 1:
                        for (Goods x: Goods.values()) {
                            if (x.getCategory() == "gadjet") {
                                x.print();
                            }
                        }
                        System.out.println("What u want to add?");
                        String choise2 = sc.next();
                        cart.addSmth(cart, Goods.valueOf(choise2));
                        break;
                    case 2:
                        for (Goods x: Goods.values()) {
                            if (x.getCategory() == "dish") {
                                x.print();
                            }
                        }
                        System.out.println("What u want to add?");
                        String choise3 = sc.next();
                        cart.addSmth(cart, Goods.valueOf(choise3));
                        break;
                    case 3:
                        for (Goods x: Goods.values()) {
                            x.print();
                        }
                        System.out.println("What u want to add?");
                        String choise4 = sc.next();
                        cart.addSmth(cart, Goods.valueOf(choise4));
                        break;
                    default: break;
                }
            }
            System.out.println(cart);
        }
    }
}