package ru.mirea.practice.s0000001.num3;

import java.util.Scanner;

public class Main {

    public void exceptionDemo() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите целое число: ");
            String intString = sc.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено нецелое число");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: попытка деления на ноль");
            } catch (Exception e) {
                System.out.println("Общее исключение: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Ошибка при закрытии Scanner");
        }
    }

    public static void main(String[] args) {
        Main ex = new Main();
        ex.exceptionDemo();
    }
}
