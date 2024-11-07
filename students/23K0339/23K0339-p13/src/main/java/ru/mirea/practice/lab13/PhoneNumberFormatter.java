package ru.mirea.practice.lab13;

public class PhoneNumberFormatter {
    private String formattedNumber;

    public PhoneNumberFormatter(String number) {
        if (number.startsWith("+")) {
            formattedNumber = formatInternational(number);
        } else if (number.startsWith("8")) {
            formattedNumber = formatRussian(number);
        } else {
            System.out.println("Неверный формат номера");
        }
    }


    private String formatInternational(String number) {
        return number.substring(0, number.length() - 10) + " "
                + number.substring(number.length() - 10, number.length() - 7) + "-"
                + number.substring(number.length() - 7, number.length() - 4) + "-"
                + number.substring(number.length() - 4);
    }


    private String formatRussian(String number) {
        return "+7 " + number.substring(1, 4) + "-"
                + number.substring(4, 7) + "-"
                + number.substring(7);
    }

    @Override
    public String toString() {
        return formattedNumber;
    }

    public static void main(String[] args) {
        PhoneNumberFormatter phone1 = new PhoneNumberFormatter("+79175655655");
        System.out.println(phone1);

        PhoneNumberFormatter phone2 = new PhoneNumberFormatter("+819175655655");
        System.out.println(phone2);

        PhoneNumberFormatter phone3 = new PhoneNumberFormatter("89175655655");
        System.out.println(phone3);
    }
}
