package ru.mirea.practice.s23l0908.task6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        // Đơn giản hóa '[\\w]' thành '\\w'
        String regex = "\\w[-_.]+@\\w+(\\.\\w+)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("user@example.com, root@localhost, myhost@@@com.ru");
        System.out.println("String: user@example.com, root@localhost, myhost@@@com.ru");
        System.out.println("Regex: \\w[-_.]+@\\w+(\\.\\w+)*");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


