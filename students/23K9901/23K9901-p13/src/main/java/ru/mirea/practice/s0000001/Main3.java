package ru.mirea.practice.s0000001;

public final class Main3 {
    private Main3() {}

    public static void main(String[] args) {
        String[] phoneNumbers = {
            "+79175655655",
            "+104289652211",
            "89175655655"
        };

        for (String number : phoneNumbers) {
            PhoneNumber1 phoneNumber;
            if (number.startsWith("+")) {
                phoneNumber = new InternationalPhoneNumber1(number);
            } else if (number.startsWith("8")) {
                phoneNumber = new RussianPhoneNumber1(number);
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
