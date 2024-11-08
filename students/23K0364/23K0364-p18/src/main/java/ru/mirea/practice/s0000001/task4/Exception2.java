package ru.mirea.practice.s0000001.task4;

import java.util.Scanner;

public class Exception2 {
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
            } finally {
                System.out.println("Execution completed.");
            }
        }
    }

    public static void main(String[] args) {
        Exception2 example = new Exception2();
        example.exceptionDemo();
    }
}


//Блок finally выполняется всегда, даже если произошло исключение. Это может быть полезно,
// например, для освобождения ресурсов (закрытие файлов, соединений и т. д.),
// несмотря на наличие ошибок.
