package ru.mirea.practice.s23k0505.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(
            "((([0-2]\\d)(?<!(00|29))/0\\d|([0-2]\\d)(?<!(00|29))/1[0-2])|(29|30)/(0[469]|11)|((29|3[01])/(0[13578]|1[02])))/(19\\d{2}|[2-9]\\d{3})"
                + "|(29/02/((19|[2-9]\\d)([2468][048]|[13579][26]|0[48])))");
        Matcher matcher;

        for (int year = 1900; year <= 2050; year++) {
            for (int month = 0; month <= 12; month++) {
                for (int day = 0; day <= 31; day++) {
                    String date = String.format("%02d/%02d/%04d", day, month, year);
                    matcher = pattern.matcher(date);
                    if (matcher.find()) {
                        System.out.println(matcher.group());
                    }
                }
            }
        }
    }
}

//(([0-2][0-8]/0\d|[0-2][0-8]/1[0-2])|(29|30)/(0[469]|11)|((29|3[01])/(0[13578]|1[02])))/(19\d{2}|[2-9]\d{3})
