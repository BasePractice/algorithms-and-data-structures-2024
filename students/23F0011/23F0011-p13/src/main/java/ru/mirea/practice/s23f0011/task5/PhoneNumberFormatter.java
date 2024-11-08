package ru.mirea.practice.s23f0011.task5;

public abstract class PhoneNumberFormatter {

    public static String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            // Формат: +<Код страны><Номер 10 цифр>
            if (phoneNumber.length() == 12) {
                return phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
            } else if (phoneNumber.length() == 13) {
                return phoneNumber.substring(0, 4) + "-" + phoneNumber.substring(4, 7) + "-" + phoneNumber.substring(7);
            } else {
                throw new IllegalArgumentException("Неверный формат телефонного номера: " + phoneNumber);
            }
        } else if (phoneNumber.startsWith("8")) {
            // Формат: 8<Номер 10 цифр>
            if (phoneNumber.length() == 11) {
                return "+7" + "-" + phoneNumber.substring(1, 4) + "-" + phoneNumber.substring(4, 7) + "-" + phoneNumber.substring(7);
            } else {
                throw new IllegalArgumentException("Неверный формат телефонного номера: " + phoneNumber);
            }
        } else {
            throw new IllegalArgumentException("Неверный формат телефонного номера: " + phoneNumber);
        }
    }
}

