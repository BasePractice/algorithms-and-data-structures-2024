package ru.mirea.practice.s0000001.task3;

import java.util.Scanner;

public class Exception1 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("An error occurred while trying to read input: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception1 example = new Exception1();
        example.exceptionDemo();
    }
}


//Если блок catch (Exception e) стоит перед другими блоками, все исключения будут перехватываться этим блоком,
// и более специфичные исключения, такие как NumberFormatException или ArithmeticException,
// не будут обработаны корректно. Следовательно, для корректной работы
// блок catch (Exception e) должен быть последним.
