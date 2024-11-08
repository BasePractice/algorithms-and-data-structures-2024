package ru.mirea.practice.s23k0140.task5;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String[] testNumbers = {"+79175655655", "89175655655", "+104289652211", "+12345678901",
            "71234567890", "+7abcdefghij", "+7917565565", "8917565565a"
        };

        for (String number : testNumbers) {
            try {
                PhoneNumber phoneNumber = new PhoneNumber(number);
                System.out.println("Вход: " + number + " -> Форматированный: " + phoneNumber.format());
            } catch (IllegalArgumentException e) {
                System.out.println("Вход: " + number + " -> Ошибка: " + e.getMessage());
            }
        }
    }
}