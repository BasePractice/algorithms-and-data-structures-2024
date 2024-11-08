package ru.mirea.practice.s0000001.task5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PhoneFormater {
    public static String formatingNumber(String phoneNumber) {
        Pattern patternWithCountryCode = Pattern.compile("\\+(\\d{1,3})(\\d{3})(\\d{3})(\\d{4})");
        Matcher matcherWithCountryCode = patternWithCountryCode.matcher(phoneNumber);

        if (matcherWithCountryCode.matches()) {
            return "+" + matcherWithCountryCode.group(1)
                + " " + matcherWithCountryCode.group(2) + " " + matcherWithCountryCode.group(3)
                + " " + matcherWithCountryCode.group(4);
        }

        Pattern patternWithEight = Pattern.compile("8(\\d{3})(\\d{3})(\\d{4})");
        Matcher matcherWithEight = patternWithEight.matcher(phoneNumber);

        if (matcherWithEight.matches()) {
            return "+7 " + matcherWithEight.group(1) + " " + matcherWithEight.group(2) + " " + matcherWithEight.group(3);
        }

        return "wrong format";
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter phone num: ");
            String phone1 = sc.nextLine();
            String formated = formatingNumber(phone1);
            System.out.println("Formated number: " + formated);
        }
    }
}
