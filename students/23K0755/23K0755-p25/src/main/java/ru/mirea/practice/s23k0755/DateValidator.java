package ru.mirea.practice.s23k0755;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class DateValidator {
    public static void main(String[] args) {
        String[] dates = {
            "29/02/2000", "30/04/2003", "01/01/2003",
            "29/02/2001", "30-04-2003", "1/1/1899"
        };

        String dateRegex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$";
        Pattern pattern = Pattern.compile(dateRegex);

        System.out.println("Проверка дат в формате dd/mm/yyyy:");
        for (String date : dates) {
            Matcher matcher = pattern.matcher(date);
            System.out.println(date + ": " + matcher.matches());
        }
    }
}
