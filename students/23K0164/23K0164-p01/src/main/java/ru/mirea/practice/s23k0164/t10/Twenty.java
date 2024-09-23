package ru.mirea.practice.s23k0164.t10;
import java.util.Scanner;

public final class Twenty {
    private Twenty(){

    }

    public static void main(String[] args) {
        printOddNumbers();
    }

    private static void printOddNumbers() {
       try(Scanner scanner = new Scanner(System.in)) {
           int number = scanner.nextInt();
           if (number != 0) {
               printOddNumbers();
               if (number % 2 != 0) {
                   System.out.println(number);
               }
           }
           if (number == 0) {
               scanner.close();
           }
       }
    }
}
