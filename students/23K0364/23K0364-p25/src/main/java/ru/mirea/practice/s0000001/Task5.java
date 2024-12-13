package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

public abstract class Task5 {
    public static void main(String[] args) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19[0-9]{2}|[2-9][0-9]{3})$";
        String[] dates = {"29/02/2000", "30/04/2003", "01/01/2003", "29/02/2001", "30-04-2003", "1/1/1899"};

        for (String date : dates) {
            System.out.println(date + " is valid: " + Pattern.matches(regex, date));
        }
    }
}
