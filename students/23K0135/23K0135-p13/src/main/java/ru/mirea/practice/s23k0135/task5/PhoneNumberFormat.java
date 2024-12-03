package ru.mirea.practice.s23k0135.task5;

public final class PhoneNumberFormat {

    private PhoneNumberFormat() {}

    public static String formatPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            // International format
            if (phoneNumber.length() != 12) {
                throw new IllegalArgumentException("Invalid international phone number format.");
            }
            return phoneNumber.substring(0, 2) + "-" + phoneNumber.substring(2, 5) + "-" + phoneNumber.substring(5, 8) + "-"
                + phoneNumber.substring(8);
        } else if (phoneNumber.startsWith("8")) {
            // Russian format
            if (phoneNumber.length() != 11) {
                throw new IllegalArgumentException("Invalid Russian phone number format.");
            }
            return "+7-" + phoneNumber.substring(1, 4) + "-" + phoneNumber.substring(4, 7) + "-" + phoneNumber.substring(7);
        } else {
            throw new IllegalArgumentException("Invalid phone number format.");
        }
    }

    public static void main(String[] args) {
        final String[] phoneNumbers = {
            "+79175655655",
            "+104289652211",
            "+10428965221",
            "89175655655"
        };

        for (String phoneNumber : phoneNumbers) {
            try {
                String formattedNumber = formatPhoneNumber(phoneNumber);
                System.out.println("Original: " + phoneNumber + ", Formatted: " + formattedNumber);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
