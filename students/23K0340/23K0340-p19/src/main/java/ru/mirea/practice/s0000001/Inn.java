package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Inn {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter INN: ");
            String inn = sc.nextLine();
            try {
                testInn(inn);
                System.out.println("Success");
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

    private static void testInn(String inn) throws Exception {
        if (inn.length() != 12) {
            throw new Exception("Invalid INN");
        }
    }
}
