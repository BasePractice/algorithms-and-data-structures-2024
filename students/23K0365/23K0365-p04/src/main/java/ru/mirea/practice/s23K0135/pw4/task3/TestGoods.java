package ru.mirea.practice.s23K0135.pw4.task3;

import java.util.Scanner;

public abstract class TestGoods {
    public static void main(String[] args) {
        User u = new User(1, 1);
        try (Scanner sc = new Scanner(System.in)) {
            Cart cart = new Cart(new String[0], 0);
            System.out.println("Type ur login:");
            int loginNew = sc.nextInt();
            System.out.println("Type ur password:");
            int passwordNew = sc.nextInt();
            if (u.tryEnter(loginNew, passwordNew)) {
                System.out.println("Type ur action:\n1.See gadjets\t2.See dishes\t3.See all");
                switch (sc.nextInt()) {
                    case 1:
                        for (Goods x: Goods.values()) {
                            if ("gadjet".equals(x.getCategory())) {
                                x.print();
                            }
                        }
                        System.out.println("What u want to add?");
                        String choise2 = sc.next();
                        cart.addSmth(cart, Goods.valueOf(choise2));
                        break;
                    case 2:
                        for (Goods x: Goods.values()) {
                            if ("dish".equals(x.getCategory())) {
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
                    default:
                        break;
                }
            }
            cart.finishShopping();
        }
    }
}
