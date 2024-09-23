package ru.mirea.practice.s23k0164.t7;
import java.util.Scanner;
public final class Nine {
    private Nine(){

    }
    private static long countSequences(int a, int b) {

        if (a > b + 1) {
            return 0;
        }

        if (a == 0) {
            return 1;
        }

        if (b == 0) {
            return a == 1 ? 1 : 0;
        }

        return binomialCoefficient(b + 1, a);
    }

    private static long binomialCoefficient(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        k = Math.min(k, n - k);

        long result = 1;
        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {


            System.out.print("Введите количество нулей (a): ");
            int a = scanner.nextInt();

            System.out.print("Введите количество единиц (b): ");
            int b = scanner.nextInt();


            long result = countSequences(a, b);
            System.out.println("Количество последовательностей: " + result);

        }
    }

}
