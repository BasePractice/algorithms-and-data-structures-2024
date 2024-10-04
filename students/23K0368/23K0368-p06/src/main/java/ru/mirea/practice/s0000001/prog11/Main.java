package ru.mirea.practice.s0000001.prog11;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an temp: ");
            Double temp = sc.nextDouble();
            System.out.print("Enter K - kelvins, F - farengates: ");
            String sys = sc.next();

            Convertation convert = new Convertation(temp);
            convert.convert(temp, sys);
            System.out.println(convert.toString());
        }
    }
}
