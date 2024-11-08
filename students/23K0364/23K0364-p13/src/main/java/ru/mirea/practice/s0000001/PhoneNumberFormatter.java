package ru.mirea.practice.s0000001;

public abstract class PhoneNumberFormatter {

    public static String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            return phoneNumber.replaceAll("(\\+\\d{1,3})(\\d{3})(\\d{3})(\\d{4})", "$1$2-$3-$4");
        } else if (phoneNumber.startsWith("8")) {
            return phoneNumber.replaceAll("(8)(\\d{3})(\\d{3})(\\d{4})", "+7$2-$3-$4");
        } else {
            return "Invalid phone number";
        }
    }

    public static void main(String[] args) {
        System.out.println(formatPhoneNumber("+79175655655"));
        System.out.println(formatPhoneNumber("89175655655"));
    }
}

