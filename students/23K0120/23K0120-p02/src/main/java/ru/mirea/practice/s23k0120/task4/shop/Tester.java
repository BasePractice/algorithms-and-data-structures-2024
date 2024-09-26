package ru.mirea.practice.s23k0120.task4.shop;

import java.util.Locale;
import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        String choice = " ";
        String name;
        float cost;
        Item item;

        final Locale russian = new Locale("ru", "Ru");
        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);
            while (!"exit".equalsIgnoreCase(choice)) {
                System.out.print("\nEnter command: " + "\nExit: Exit "
                        + "\nShow all: show"
                        + "\nAdd item: Add "
                        + "\nRemove item: Remove"
                        + "\nFind item: Find" + "\nEnter here: ");
                choice = sc.nextLine();
                switch (choice.toLowerCase(russian)) {
                    case "exit":
                        break;
                    case "show":
                        System.out.printf("\nList of items in the shop: %s", shop);
                        break;
                    case "add":
                        System.out.print("\nEnter item name: ");
                        name = sc.nextLine();
                        System.out.print("Enter item cost: ");
                        cost = sc.nextFloat();
                        item = new Item(name, cost);
                        shop.add(item);
                        System.out.printf("Item %s added successfully", item);
                        choice = sc.nextLine();
                        break;
                    case "remove":
                        System.out.println("\nRemoving an item from the shop");
                        System.out.println("Enter item name: ");
                        name = sc.nextLine();
                        shop.remove(name);
                        choice = sc.nextLine();
                        break;
                    case "find":
                        String choiceFind;
                        System.out.println("\nEnter searching method (name/cost): ");
                        choiceFind = sc.nextLine().toLowerCase(russian);
                        if ("name".equals(choiceFind)) {
                            System.out.println("Enter item name: ");
                            name = sc.nextLine();
                            System.out.println("Found items:");
                            System.out.print("Found items: " + shop.findByName(name) + '\n');
                        } else {
                            System.out.println("Enter item cost: ");
                            cost = sc.nextFloat();
                            System.out.print("Found items: " + shop.findByCost(cost) + '\n');
                        }
                        choice = sc.nextLine();
                        break;
                    default:
                        System.out.println("\nError! Unknown command");
                        break;
                }
                System.out.println("\nPress \"Enter\" to continue");

                choice = sc.nextLine();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
