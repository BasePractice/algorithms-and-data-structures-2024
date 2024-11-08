package ru.mirea.practice.s0000001.prog5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class Main {
    public static void main(String[] args) {
        // Пример дат
        String[] dates = {
            "29/02/2000", "30/04/2003", "01/01/2003",  // правильные
            "29/02/2001", "30-04-2003", "1/1/1899"      // неправильные
        };

        // Регулярное выражение для проверки дат
        String regex = "^(?:(?:31/(?:0[13578]|1[02]))|(?:30/(?:0[13-9]|1[0-2]))|(?:29/02/(?:(?:19|[2-9]\\d)(?:0[48]|"
                + "[2468][048]|[13579][26])|2000))|(?:0[1-9]|1\\d|2[0-8])/(?:0[1-9]|1[0-2]))/(19\\d{2}|[2-9]\\d{3})$";

        // Создаем шаблон и проверяем каждую дату
        Pattern pattern = Pattern.compile(regex);

        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                System.out.println(date + " is valid.");
            } else {
                System.out.println(date + " is invalid.");
            }
        }
    }
}

