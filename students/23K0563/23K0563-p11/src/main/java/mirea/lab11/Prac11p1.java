package mirea.lab11;

/* Написать программу, выводящую фамилию разработчика, дату и время
получения задания, а также дату и время сдачи задания. Для получения
последней даты и времени использовать класс Date из пакета java.util.*
(Объявление Dated=newDate() или метод System.currentTimeMillis(). */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Prac11p1 {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("EEEE, dd.MM.yyyy в HH:mm:ss");
        Calendar rec = new GregorianCalendar(2024, Calendar.SEPTEMBER, 4, 9, 0, 0);
        Calendar out = Calendar.getInstance();
        System.out.println("Разработчик: Сидоров");
        System.out.println("Дата получения работы: " + f.format(rec.getTime()));
        System.out.println("Дата сдачи работы: " + f.format(out.getTime()));
    }
}
