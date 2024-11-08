package ru.mirea.practice.s23k0140.task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private String countryCode;
    private String localNumber;

    public PhoneNumber(String inputString) {
        parseInput(inputString);
    }

    private void parseInput(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Входная строка не может быть пустой.");
        }


        String plusPattern = "^\\+(\\d{1,3})(\\d{10})$";
        String eightPattern = "^8(\\d{10})$";

        Pattern patternPlus = Pattern.compile(plusPattern);
        Matcher matcherPlus = patternPlus.matcher(input);

        Pattern patternEight = Pattern.compile(eightPattern);
        Matcher matcherEight = patternEight.matcher(input);

        if (matcherPlus.matches()) {
            this.countryCode = matcherPlus.group(1);
            this.localNumber = matcherPlus.group(2);
        } else if (matcherEight.matches()) {
            this.countryCode = "7";
            this.localNumber = matcherEight.group(1);
        } else {
            throw new IllegalArgumentException("Некорректный формат номера телефона.");
        }
    }

    public String format() {
        String part1 = localNumber.substring(0, 3);
        String part2 = localNumber.substring(3, 6);
        String part3 = localNumber.substring(6, 10);

        return "+" + countryCode + part1 + "-" + part2 + "-" + part3;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    @Override
    public String toString() {
        return format();
    }
}