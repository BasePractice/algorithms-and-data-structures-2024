package ru.mirea.practice.s0000001;

import java.util.Date;

abstract class DateComparison {
    protected Date currentDate;
    protected Date userDate;

    public DateComparison() {
        this.currentDate = new Date(); // Текущая дата и время
    }

    public abstract void setUserDate(String dateString);

    public void compareDates() {
        if (userDate.before(currentDate)) {
            System.out.println("Введенная дата " + userDate + " раньше текущей даты " + currentDate);
        } else if (userDate.after(currentDate)) {
            System.out.println("Введенная дата " + userDate + " позже текущей даты " + currentDate);
        } else {
            System.out.println("Введенная дата " + userDate + " равна текущей дате");
        }
    }
}
