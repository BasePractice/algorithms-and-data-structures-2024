package ru.mirea.practice.s23K0135.prog10;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNext()) {
                String str = sc.nextLine();
                int n = str.split("\\s").length;
                System.out.println(n);
            }
        }
    }
}
