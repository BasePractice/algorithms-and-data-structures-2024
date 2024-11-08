package ru.mirea.practice.s23k0087;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Task2 {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Нынешняя дата и время: " + formatter.format(currentDate));
        System.out.println("Введите дату и время в формате dd.MM.yyyy HH:mm");
        try (Scanner sc = new Scanner(System.in)) {
            try {
                Date date = formatter.parse(sc.nextLine());
                if (date.after(currentDate)) {
                    System.out.println("Введенные дата и время позже нынешней");
                } else {
                    System.out.println("Введенные дата и время раньше нынешней");
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
