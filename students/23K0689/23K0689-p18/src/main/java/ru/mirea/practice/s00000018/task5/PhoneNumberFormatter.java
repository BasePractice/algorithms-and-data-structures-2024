package ru.mirea.practice.s00000018.task5;

public abstract class PhoneNumberFormatter {
    public static String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            String countryCode = phoneNumber.substring(1, 2);
            String number = phoneNumber.substring(2);
            return "+" + countryCode + " " + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
        } else if (phoneNumber.startsWith("8")) {
            String number = phoneNumber.substring(1);
            return "+7 " + number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
        } else {
            throw new IllegalArgumentException("Инкор. форм. номера");
        }
    }

    public static void main(String[] args) {
        System.out.println(formatPhoneNumber("+79175655655")); // +7 917 565 6555
        System.out.println(formatPhoneNumber("89175655655")); // +7 917 565 6555
        System.out.println(formatPhoneNumber("+10428965221")); // С этим номером проблема в условии он длиньше чем там сказанно
    }
}
