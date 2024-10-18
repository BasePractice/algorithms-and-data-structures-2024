package ru.mirea.practice.s23l0908.Task4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.println("You can /add computer to shop or /delete it.\n" +
            "After adding few computers, you'll be able to /search exact one or rate it.\n" +
            "Type /show to see whole list of computers.");
        String cmd = "";
        while (!cmd.equals("/end")) {
            cmd = input.nextLine();
            if (cmd.startsWith("/add")) {
                cmd = cmd.substring(5);
                if (shop.add(cmd)) {
                    System.out.println("Successfully added.");
                } else {
                    System.out.println("Model already exists");
                }
            } else if (cmd.startsWith("/delete")) {
                cmd = cmd.substring(8);
                if (shop.delete(cmd)) {
                    System.out.println("Successfully deleted.");
                } else {
                    System.out.println("Model doesn't exists");
                }
            } else if (cmd.startsWith("/search")) {
                cmd = cmd.substring(8);
                if (shop.find(cmd)) {
                    System.out.println("You can buy it right now.");
                } else {
                    System.out.println("You would better search for another shop...");
                }
            } else if (cmd.startsWith("/show")) {
                System.out.print(shop.toString());
            } else if (cmd.startsWith("/rate")) {
                cmd = cmd.substring(6);
                shop.rate_model(cmd);
                System.out.println("Your opinion matters.");
            } else {
                System.out.println("Unrecognised command. Please, try again.");
            }
        }
    }
}
