package ru.mirea.practice.s23l0908.task4;

import java.util.Scanner;

public final class Tester {

    private Tester() {
        throw new UnsupportedOperationException("Tester class cannot be instantiated");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Shop shop = new Shop();
            System.out.println("You can /add <computer_model> to shop or /delete <computer_model>.\n"
                + "After adding a few computers, you'll be able to /search <computer_model> or /rate <computer_model>.\n"
                + "Type /show to see the whole list of computers. Type /end to exit.");

            String cmd = "";
            while (!"/end".equals(cmd)) {
                cmd = input.nextLine().trim();

                if (cmd.startsWith("/add ")) {
                    String model = cmd.substring(5).trim();
                    if (shop.add(model)) {
                        System.out.println("Successfully added.");
                    } else {
                        System.out.println("Model already exists.");
                    }
                } else if (cmd.startsWith("/delete ")) {
                    String model = cmd.substring(8).trim();
                    if (shop.delete(model)) {
                        System.out.println("Successfully deleted.");
                    } else {
                        System.out.println("Model doesn't exist.");
                    }
                } else if (cmd.startsWith("/search ")) {
                    String model = cmd.substring(8).trim();
                    if (shop.find(model)) {
                        System.out.println("You can buy it right now.");
                    } else {
                        System.out.println("You'd better search for another shop...");
                    }
                } else if ("/show".equals(cmd)) {
                    System.out.print(shop);
                } else if (cmd.startsWith("/rate ")) {
                    String model = cmd.substring(6).trim();
                    shop.rateModel(model);
                    System.out.println("Your opinion matters.");
                } else if (!"/end".equals(cmd)) {
                    System.out.println("Unrecognized command. Please, try again.");
                }
            }
        }
    }
}

