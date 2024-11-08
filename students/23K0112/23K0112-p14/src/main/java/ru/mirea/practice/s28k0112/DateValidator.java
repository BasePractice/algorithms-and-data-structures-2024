package ru.mirea.practice.s28k0112;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class DateValidator {
    private DateValidator() {

    }

    private static final String DATE_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19[0-9]{2})$";
    private static final Pattern pattern = Pattern.compile(DATE_REGEX);

    public static void main(String[] args) {
        String[] testDates = {"29/02/2000", "29/02/2001", "30/04/2003", "30/04/1999", "31/12/1998", "30-04-2003"};

        for (String date : testDates) {
            Matcher matcher = pattern.matcher(date);
            if (matcher.matches()) {
                System.out.println("Valid date: " + date);
            } else {
                System.out.println("Invalid date: " + date);
            }
        }
    }
}