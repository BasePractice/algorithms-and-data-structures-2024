package ru.mirea.practice.lab14;

import java.util.regex.Pattern;

public abstract class DateValidator {
    public static boolean isValidDate(String date) {
        String regex = "^((0[1-9]|[12][0-9]|3[01])/(0[13578]|1[02])"
                + "|((0[1-9]|[12][0-9]|30)/(0[469]|11))|((0[1-9]|"
                + "1[0-9]|2[0-8])/02))/\\d{4}$|^(29/02/((1[6-9]|[2-9]\\d)?(0[48]|[2468][048]"
                + "|[13579][26])|(1600|2000|2400|2800)))$";
        return Pattern.matches(regex, date);
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("29/02/2000"));
        System.out.println(isValidDate("30-04-2003"));
        System.out.println(isValidDate("1/1/1899"));
        System.out.println(isValidDate("01/01/2003"));
        System.out.println(isValidDate("29/02/2003"));
    }
}

