package ru.mirea.practice.s0000001.task2;

import java.util.Date;

public final class DateUtils {

    private DateUtils() {
        throw new UnsupportedOperationException("Этот класс не должен быть инстанцирован.");
    }

    public static void compareDates(Date userDate) {
        Date currentDate = new Date();

        if (userDate.before(currentDate)) {
            System.out.println("Введенная дата раньше текущей даты.");
        } else if (userDate.after(currentDate)) {
            System.out.println("Введенная дата позже текущей даты.");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой.");
        }
    }
}
