package ru.mirea.practice.s23l0908.task3;

import java.util.regex.Pattern;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String[] dates = {
            "29/02/2000", "30/04/2003", "01/01/2003",
            "29/02/2001", "30-04-2003", "1/1/1899"
        };

        String regex = "^(?:(?:31/(?:0[13578]|1[02]))"
            + "|(?:30/(?:0[13-9]|1[0-2]))"
            + "|(?:0[1-9]|1\\d|2[0-8])/(?:0[1-9]|1[0-2]))/(19\\d{2}|[2-9]\\d{3})$"
            + "|^29/02/(?:(?:19|[2-9]\\d)(?:0[48]|[2468][048]|[13579][26])"
            + "|(?:[2-9]\\d{2}(?<!00)))$";

        for (String date : dates) {
            if (Pattern.matches(regex, date)) {
                System.out.println(date + " -> корректная дата.");
            } else {
                System.out.println(date + " -> некорректная дата.");
            }
        }
    }
}

