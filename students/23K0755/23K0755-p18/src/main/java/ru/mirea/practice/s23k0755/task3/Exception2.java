package ru.mirea.practice.s23k0755.task3;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = null;

        try {
            myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            if (myScanner != null) {
                myScanner.close();
            }
        }
    }

    public static void main(String[] args) {
        Exception2 example = new Exception2();
        example.exceptionDemo();
    }
}

//Добавление общего блока catch в код позволяет:
//Обработка всех исключений: Теперь программа может обрабатывать любые исключения
//Предоставление информативного вывода: Пользователь получит сообщение об ошибке, даже если она не была предсказана
//Избежание аварийного завершения: Если произойдет ошибка, программа не завершится аварийно, а продолжит выполнять блок finally и закроет Scanner
