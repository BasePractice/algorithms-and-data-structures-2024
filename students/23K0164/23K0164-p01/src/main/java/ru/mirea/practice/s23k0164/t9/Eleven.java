package ru.mirea.practice.s23k0164.t9;
import java.util.Scanner;

public final class Eleven {

    private Eleven(){

    }

    public static void main(String[] args) {
        countOnes();
    }

    private static void countOnes() {
        try (Scanner scanner = new Scanner(System.in)) {
            int countOfOnes = 0;
            int currentNumber;
            int previousNumber = -1;

            while (true) {
                currentNumber = scanner.nextInt();

                if (currentNumber == 0 && previousNumber == 0) {
                    break;
                }

                if (currentNumber == 1) {
                    countOfOnes++;
                }

                previousNumber = currentNumber;
            }

            System.out.println(countOfOnes);
        }
    }
}
