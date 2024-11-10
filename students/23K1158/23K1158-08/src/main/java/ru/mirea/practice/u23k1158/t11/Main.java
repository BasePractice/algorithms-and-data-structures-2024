package ru.mirea.practice.u23k1158.t11;

import java.util.Scanner;

public abstract class Main {

    public static int countOnes(int count, char prev, Scanner scanner) {
        int num = scanner.nextInt();
        if (num == 1) {
            return countOnes(count + 1, '1', scanner);
        } else if (num == 0) {
            if (prev != '0') {
                return countOnes(count, '0', scanner);
            } else {
                return count;
            }
        }
        return countOnes(count, prev, scanner);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(countOnes(0, '1', scanner));
        }
    }
}
