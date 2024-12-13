package ru.mirea.practice.s0000001.num2;

import java.util.Scanner;

public class Interface {
    Shop shop;
    Scanner sc;

    public Interface(int size) {
        shop = new Shop(size);
        sc = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("1. Add Computer");
        System.out.println("2. Remove Computer");
        System.out.println("3. Find Computer");
        System.out.println("4. Show All Computers");
        System.out.println("5. Exit");
    }

    public void addComp() {
        final String name;
        final String processor;
        final int ram;
        final int storage;

        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter processor: ");
        processor = sc.next();

        System.out.print("Enter RAM (GB): ");
        ram = sc.nextInt();

        System.out.print("Enter storage (GB): ");
        storage = sc.nextInt();

        shop.add(new Computer(name, processor, ram, storage));
    }

    public void start() {
        while (true) {
            menu();
            int choice = sc.nextInt();

            if (choice == 1) {
                addComp();
            } else if (choice == 2) {
                System.out.print("Enter name to remove: ");
                String name = sc.next();
                shop.remove(name);
            } else if (choice == 3) {
                System.out.print("Enter name to find: ");
                String name = sc.next();
                System.out.println(shop.find(name));
            } else if (choice == 4) {
                for (int i = 0; i < shop.n; i++) {
                    System.out.println(shop.c[i]);
                }
            } else if (choice == 5) {
                break;
            }
        }
    }
}
