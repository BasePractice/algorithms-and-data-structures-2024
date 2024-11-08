package ru.mirea.practice.s23f0011.task3;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (Exception e) { // Обработка общего исключения
                System.out.println("Error: An error occurred during calculation.");
            }
        }
    }
}
/*
Поведение программы:
- Ввод "Qwerty": Выводится сообщение "Error: An error occurred during calculation."
- Ввод "0": Выводится сообщение "Error: An error occurred during calculation."
- Ввод "1.2": Выводится сообщение "Error: An error occurred during calculation."
- Ввод "1": Программа выполняется без ошибок.
 */
