package ru.mirea.practice.s27k0112;

import java.util.Date;
import java.util.Scanner;

public final class Task2 {
    private Task2() {

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Date now = new Date();

            System.out.println("Введите дату в формате <Год><Месяц><Число> (например, 2024 10 27):");
            int year = sc.nextInt();
            int month = sc.nextInt() - 1;
            int day = sc.nextInt();

            System.out.println("Введите время в формате <Часы><Минуты> (например, 14 30):");
            int hours = sc.nextInt();
            int minutes = sc.nextInt();

            Date userDate = new Date(year - 1900, month, day, hours, minutes);
            System.out.println(now);
            System.out.println(userDate);

            if (userDate.before(now)) {
                System.out.println("Введеная дата меньше текущей");
            } else if (userDate.after(now)) {
                System.out.println("Введеная дата больше текущей");
            } else {
                System.out.println("Введеная дата равна текущей");
            }
        }
    }
}
