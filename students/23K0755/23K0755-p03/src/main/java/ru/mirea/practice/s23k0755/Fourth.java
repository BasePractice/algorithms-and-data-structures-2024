package ru.mirea.practice.s23k0755;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class Fourth {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1) Rubles\n2) Dollars\n3) Euro\n4) Yuan");
            System.out.print("Choose the currency that you have:");
            int com = scanner.nextInt();
            System.out.print("Enter the amount:");
            float value = scanner.nextFloat();
            Conventor bank = new Conventor(com, value);
            float[] res = bank.recount();
            System.out.printf("In rubles: %.2f ₽\n", res[0]);
            System.out.println("In dollars: " + NumberFormat.getCurrencyInstance(Locale.US).format(res[1]));
            System.out.println("In euro: " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(res[2]));
            System.out.println("In yuan: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(res[3]));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
