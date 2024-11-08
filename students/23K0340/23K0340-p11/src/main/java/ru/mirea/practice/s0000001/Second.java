package ru.mirea.practice.s0000001;

import java.util.Calendar;
import java.util.Scanner;

public abstract class Second {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal2.set(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println(cal1.toString());
            System.out.println("Введите Ваш год:");
            System.out.println("Введите Ваш месяц:");
            System.out.println("Введите Ваше число:");
            System.out.println("Введите Ваш час:");
            System.out.println("Введите Ваши минуты:");
            if (cal1.after(cal2)) {
                System.out.println("Введенное Вами время было раньше нынешнего");
            } else {
                System.out.println("Введенное Вами время будет позже нынешнего");
            }
        }
    }
}
