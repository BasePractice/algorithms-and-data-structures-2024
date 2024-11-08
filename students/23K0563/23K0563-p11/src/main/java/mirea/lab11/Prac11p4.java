package mirea.lab11;

/* Напишите пользовательский код, который формирует объекты Date и
Calendar по следующим данным, вводимым пользователем:
<Год><Месяц><Число>
<Часы1><минуты> */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public abstract class Prac11p4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите формат вывода даты\nИспользуйте <Год><Месяц><Число><Часы1><минуты>:");
            String inp = sc.nextLine();
            inp = inp.replace("<Год>", "yyyy");
            inp = inp.replace("<Месяц>", "MM");
            inp = inp.replace("<Число>", "dd");
            inp = inp.replace("<Часы1>", "hh");
            inp = inp.replace("<минуты>", "mm");
            SimpleDateFormat f = new SimpleDateFormat(inp);
            System.out.println("Текущая дата:\n" + f.format(Calendar.getInstance().getTime()));
        }
    }
}
