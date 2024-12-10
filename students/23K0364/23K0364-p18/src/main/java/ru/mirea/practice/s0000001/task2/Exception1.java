package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public class Exception1 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {  // Используем try-with-resources
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception1 example = new Exception1();
        example.exceptionDemo();
    }
}

//Qwerty: В этом случае, программа попытается преобразовать строку "Qwerty" в целое число с помощью
// метода Integer.parseInt(intString). Это вызовет исключение java.lang.NumberFormatException, так как "Qwerty"
// нельзя преобразовать в число.
//0: Если пользователь введет 0, при попытке деления 2 / 0 произойдет исключение java.lang.ArithmeticException,
// так как деление на ноль невозможно.
//1.2: Если введено значение с плавающей запятой, например, 1.2,
// то будет выброшено исключение java.lang.NumberFormatException,
// так как метод parseInt ожидает целое число, а не число с плавающей запятой.
