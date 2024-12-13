package ru.mirea.practice.s0000001.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class EmailDtermine {
    public static void main(String[] args) {
        String[] emails = {
            "user@example.com",
            "user@exa_mple.com",
            "root@localhost",
            "root@localhost..ru",
            "@example.com",
            "root@@@localhost",
            "us@er@exam@ple.com",
            "QERTt@EXAMpLE.ru",
            "user@example.comuser@example.comuser@example.com",
        };
        Pattern p1 = Pattern.compile("(\\w+)@{1}(\\w+)\\.(\\w+)");
        Matcher m1;
        for (String x : emails) {
            m1 = p1.matcher(x);
            if (m1.find() && x.lastIndexOf("@") == x.indexOf("@")
                    && x.lastIndexOf(".") == x.indexOf(".")) {
                System.out.println(x);
            }
        }
    }
}
