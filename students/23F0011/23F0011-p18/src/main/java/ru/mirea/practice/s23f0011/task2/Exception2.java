package ru.mirea.practice.s23f0011.task2;

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
                System.out.println("Error: Invalid integer input. Please enter an integer.");
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
    }
}
/*
- Ввод "Qwerty": Произойдет исключение InputMismatchException, потому что Scanner.next() ожидает целое число, а введено текстовое значение.
- Ввод "0": Произойдет исключение ArithmeticException, потому что программа пытается выполнить деление на ноль.
- Ввод "1.2": Произойдет исключение InputMismatchException, потому что Scanner.next() ожидает целое число, а введено число с плавающей точкой.
- Ввод "1": Программа выполнится без ошибок и выведет результат деления 2 на 1, то есть "2".
 */
/*
После добавления блоков try-catch:
- В случае некорректного ввода (например, "Qwerty", "1.2") выполнится блок catch для NumberFormatException.
- В случае деления на ноль (ввод "0") выполнится блок catch для ArithmeticException.
- В случае корректного ввода (например, "1") программа выполнится без ошибок и выведет результат деления.
 */

