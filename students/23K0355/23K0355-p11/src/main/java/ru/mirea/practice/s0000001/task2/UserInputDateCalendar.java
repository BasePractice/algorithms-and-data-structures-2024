package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public final class UserInputDateCalendar {

    private UserInputDateCalendar() { // Здесь добавлен пробел после {
        throw new UnsupportedOperationException("Этот класс не должен быть инстанцирован");
    }

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);

            System.out.print("Введите год: ");
            final int y = sc.nextInt();
            System.out.print("Введите месяц (1-12): ");
            final int m = sc.nextInt();
            System.out.print("Введите день: ");
            final int d = sc.nextInt();

            System.out.print("Введите часы: ");
            final int h = sc.nextInt();
            System.out.print("Введите минуты: ");
            final int min = sc.nextInt();

            Calendar cal = Calendar.getInstance();
            cal.set(y, m - 1, d, h, min, 0);
            Date dt = cal.getTime();

            System.out.println("Объект Date: " + dt);
            System.out.println("Объект Calendar: " + cal.getTime());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
