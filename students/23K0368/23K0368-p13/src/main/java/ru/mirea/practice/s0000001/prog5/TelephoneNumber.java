package ru.mirea.practice.s0000001.prog5;

public class TelephoneNumber {
    private String countryCode;  // Код страны
    private String localNumber;  // Номер телефона (10 цифр)

    public TelephoneNumber(String phone) {
        if (phone.startsWith("+")) {
            // Обработка международного формата
            parseInternationalFormat(phone);
        } else if (phone.startsWith("8") && phone.length() == 11) {
            // Обработка российского формата
            parseRussianFormat(phone);
        } else {
            throw new IllegalArgumentException("Неверный формат телефонного номера: " + phone);
        }
    }

    // Метод для обработки международного формата
    private void parseInternationalFormat(String phone) {
        this.countryCode = phone.substring(0, phone.length() - 10);
        this.localNumber = phone.substring(phone.length() - 10);
    }

    // Метод для обработки российского формата
    private void parseRussianFormat(String phone) {
        this.countryCode = "+7";
        this.localNumber = phone.substring(1);  // Убираем первую "8"
    }

    @Override
    public String toString() {
        String formattedLocalNumber = localNumber.substring(0, 3) + "-"
                + localNumber.substring(3, 6) + "-"
                + localNumber.substring(6);
        return countryCode + formattedLocalNumber;
    }
}
