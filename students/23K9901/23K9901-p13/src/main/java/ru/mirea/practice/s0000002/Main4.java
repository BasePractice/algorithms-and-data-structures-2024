package ru.mirea.practice.s0000001;

public final class Main4 {

    private Main4() {}

    public static void main(String[] args) {
        String[] phoneNumbers = {
            "+79175655655",
            "+104289652211",
            "89175655655"
        };

        for (String number : phoneNumbers) {
            PhoneNumber phoneNumber;
            if (number.startsWith("+")) {
                phoneNumber = new InternationalPhoneNumber(number);
            } else if (number.startsWith("8")) {
                phoneNumber = new RussianPhoneNumber(number);
            } else {
                System.out.println("Неверный формат номера: " + number);
                continue;
            }

            try {
                System.out.println("Форматированный номер: " + phoneNumber.formatNumber());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
