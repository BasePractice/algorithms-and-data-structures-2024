package ru.mirea.practice.s0000002.task22;

import java.util.Scanner;

public abstract class Qwer {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String n = sc.nextLine();
            System.out.println();
            try {
                n = n.replace(",", ".");
                double a = Double.parseDouble(n); //преобразовывает String в double
                System.out.println(a);
            } catch (NumberFormatException e) {
                System.out.println("!error!");
            }
        }
    }
}