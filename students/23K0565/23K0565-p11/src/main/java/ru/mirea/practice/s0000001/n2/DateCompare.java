package ru.mirea.practice.s0000001.n2;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public final class DateCompare {
    private DateCompare() {}

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Введите дату в формате ГГГГ-ММ-ДД: ");
            String userDateStr = scn.nextLine();

            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date userDate = fmt.parse(userDateStr);
                Date currDate = new Date();

                if (userDate.equals(currDate)) {
                    System.out.println("Даты совпадают");
                } else if (userDate.before(currDate)) {
                    System.out.println("Введённая дата раньше текущей");
                } else {
                    System.out.println("Введённая дата позже текущей");
                }
            } catch (ParseException e) {
                System.out.println("Неверный формат даты");
            }
        }
    }
}
