package ru.mirea.practice.s23k0143;

public abstract class PhoneNumberFormatter {

    public static void main(String[] args) {
        String phoneNumber1 = "+79253080700";
        String phoneNumber2 = "89253080700";

        System.out.println("Отформатированный номер 1: " + formatPhoneNumber(phoneNumber1));
        System.out.println("Отформатированный номер 2: " + formatPhoneNumber(phoneNumber2));
    }

    public static String formatPhoneNumber(String phoneNumber) {
        String countryCode;
        String formattedNumber;

        if (phoneNumber.startsWith("+")) {
            countryCode = phoneNumber.substring(1, phoneNumber.length() - 10);
            formattedNumber = phoneNumber.substring(phoneNumber.length() - 10);
        } else {
            countryCode = "7";
            formattedNumber = phoneNumber.substring(1);
        }

        String areaCode = formattedNumber.substring(0, 3);
        String firstPart = formattedNumber.substring(3, 6);
        String secondPart = formattedNumber.substring(6);

        return "+" + countryCode + areaCode + "-" + firstPart + "-" + secondPart;
    }
}
