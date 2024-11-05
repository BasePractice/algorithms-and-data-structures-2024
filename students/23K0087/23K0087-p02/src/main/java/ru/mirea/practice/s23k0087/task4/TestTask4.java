package ru.mirea.practice.s23k0087.task4;

import java.util.Scanner;

public abstract class TestTask4 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        try (Scanner sc = new Scanner(System.in)) {
            shop.addComputer(sc);
            shop.addComputer(sc);
            shop.addComputer(sc);
            shop.findComputer(sc);
            System.out.println("-----------------------------------");
            shop.printComputers();
            System.out.println("-----------------------------------");
            shop.removeComputer(sc);
        } catch (RuntimeException e) {
            throw e;
        }
        shop.printComputers();
    }
}