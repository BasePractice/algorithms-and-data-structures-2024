package ru.mirea.practice.s23k0120.task1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        DatabaseUI database = new DatabaseUI();
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 0;
            while (i < 3) {
                try {
                    System.out.println(i + 1);
                    database.addClient(scanner);
                    i++;
                } catch (IllegalInputStringException e) {
                    System.out.println(e.getMessage());
                }
            }
            try {
                System.out.println(database.getClient(scanner));
            } catch (IllegalInputStringException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
