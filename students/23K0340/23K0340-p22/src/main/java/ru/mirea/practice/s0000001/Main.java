package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Calc calc = new Calc(10);
            boolean end = true;
            String s = "";
            while (end) {
                s = sc.nextLine();
                if ("".equals(s)) {
                    System.out.println(calc.end());
                    break;
                }
                calc.iter(s);
            }

        }
    }
}
