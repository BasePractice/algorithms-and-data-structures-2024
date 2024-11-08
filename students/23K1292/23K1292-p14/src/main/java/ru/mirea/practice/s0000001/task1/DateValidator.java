package ru.mirea.practice.s0000001.task1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class DateValidator {
    public static void main(String[] args) {
        String[] testDates = {
            "29/02/2000",
            "30/04/2003",
            "01/01/2003",
            "29/02/2001",
            "30-04-2003",
            "1/1/1899"
        };

        String datePattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|20\\d{2}|[2-9]\\d{3})$";


        for (String date : testDates) {
            if (isValidDate(date, datePattern)) {
                System.out.println(date + " - правильная дата.");
            } else {
                System.out.println(date + " - неправильная дата.");
            }
        }
    }

    private static boolean isValidDate(String date, String pattern) {
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(date);
        return matcher.matches();
    }
}
