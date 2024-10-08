package ru.mirea.practice.s23K0135.task31;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class Currency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How much money do u have????");
            String n = sc.nextLine();
            double a = Double.valueOf(n);

            System.out.println("Choose currency:\n1.USD\t2.EURO");
            int choose = sc.nextInt();
            if (choose == 1) {
                NumberFormat format1 = NumberFormat.getCurrencyInstance(Locale.US);
                System.out.println("\nU have "
                        + format1.format(a / 99.23));
            } else if (choose == 2) {
                NumberFormat format2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                System.out.println("\nU have "
                        + format2.format(a / 97.45));
            } else {
                System.out.println("!ERROR!");

            }

        }
    }
}
