package ru.mirea.lab11.task3;

import java.util.Calendar;
import java.util.Date;

/*
Задание 3.
Доработайте класс Student, предусмотрите поле для хранения даты
рождения, перепишите метод toString() таким образом, чтобы он разработайте
метод, возвращал строковое представление даты рождения по вводимому в
метод формату даты (например, короткий, средний и полный формат даты).
 */

public class Task3 {
    public static void main(String[] args) {
        Date birthDate1 = new Date(2005-1900, Calendar.JUNE, 15);
        Student student1 = new Student("Alexey", "Pervakov", birthDate1);
        System.out.println(student1);
    }
}
