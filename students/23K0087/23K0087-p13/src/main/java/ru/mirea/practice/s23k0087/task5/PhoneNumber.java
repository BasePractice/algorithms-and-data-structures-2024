package ru.mirea.practice.s23k0087.task5;

public class PhoneNumber {
    private final String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String formatNumber() {
        String formattedNumber;

        if (phoneNumber.startsWith("+")) {
            formattedNumber = phoneNumber.replaceFirst("(\\+\\d{1,3})(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "$1 $2 $3–$4-$5");
        } else if (phoneNumber.startsWith("8")) {
            String countryCode = "+7";
            String number = phoneNumber.substring(1);
            formattedNumber = countryCode + number.replaceFirst("(\\d{3})(\\d{3})(\\d{2})(\\d{2})", " $1 $2-$3-$4");
        } else {
            throw new IllegalArgumentException("Неверный формат телефонного номера");
        }

        return formattedNumber;
    }
}
