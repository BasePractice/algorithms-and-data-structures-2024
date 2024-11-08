package ru.mirea.practice.s0000001.task2;

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
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("An error occurred while trying to read input: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception2 example = new Exception2();
        example.exceptionDemo();
    }
}


//Если ввод не является целым числом (например, строка или число с плавающей запятой),
// будет поймано исключение NumberFormatException, и выведено сообщение об ошибке ввода.
//Если введено 0, программа выведет сообщение о невозможности деления на ноль.
//Если возникает другое исключение, оно будет перехвачено общим блоком catch,
// и выведется сообщение о непредвиденной ошибке.
