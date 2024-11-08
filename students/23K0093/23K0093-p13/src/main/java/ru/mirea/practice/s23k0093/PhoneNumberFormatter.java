package ru.mirea.practice.s23k0093;

public abstract class PhoneNumberFormatter {

    public static String formatPhoneNumber(String phoneNumber) {
        String formattedNumber;

        if (phoneNumber.startsWith("+")) {
            // Формат: +<Код страны><Номер 10 цифр>
            if (phoneNumber.length() != 12 && phoneNumber.length() != 13) {
                throw new IllegalArgumentException("Неправильный формат телефонного номера.");
            }
            // Извлечение кода страны и номера телефона
            String countryCode = phoneNumber.substring(0, phoneNumber.length() - 10);
            String number = phoneNumber.substring(phoneNumber.length() - 10);
            formattedNumber = countryCode + formatNumber(number);

        } else if (phoneNumber.startsWith("8")) {
            // Формат: 8<Номер 10 цифр> для России
            if (phoneNumber.length() != 11) {
                throw new IllegalArgumentException("Неправильный формат телефонного номера.");
            }
            // Замена 8 на +7 (международный код России)
            String countryCode = "+7";
            String number = phoneNumber.substring(1);
            formattedNumber = countryCode + formatNumber(number);
        } else {
            throw new IllegalArgumentException("Неподдерживаемый формат телефонного номера.");
        }

        return formattedNumber;
    }

    private static String formatNumber(String number) {
        return number.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");
    }

    public static void main(String[] args) {
        // Примеры использования
        String[] phoneNumbers = {"+79175655655", "+104289652211", "89175655655"};

        for (String phoneNumber : phoneNumbers) {
            try {
                String formatted = formatPhoneNumber(phoneNumber);
                System.out.println("Исходный: " + phoneNumber + " -> Форматированный: " + formatted);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка для номера " + phoneNumber + ": " + e.getMessage());
            }
        }
    }
}
