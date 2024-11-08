package ru.mirea.practice.s23k0690;

import java.util.Scanner;

public final class Task4 {
    private String phoneNumber;

    private Task4() {}

    public Task4(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String format() {
        String formattedNumber;
        String digits = phoneNumber.replaceAll("\\D", "");
        if (digits.startsWith("8")) {
            digits = "7" + digits.substring(1);
        }

        if (digits.startsWith("+")) {
            formattedNumber = formatInternational(digits);
        } else {
            formattedNumber = formatDomestic(digits);
        }
        return formattedNumber;
    }

    private String formatInternational(String number) {
        String countryCode = number.substring(1, number.length() - 10);
        String localNumber = number.substring(number.length() - 10);
        return "+" + countryCode + " " + localNumber.substring(0, 3) + "–" + localNumber.substring(3, 6) + "–" + localNumber.substring(6);
    }

    private String formatDomestic(String number) {
        String localNumber = number.substring(1);
        return "+7 " + localNumber.substring(0, 3) + "–" + localNumber.substring(3, 6) + "–" + localNumber.substring(6);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите телефонный номер в формате +<Код страны> <Номер 10 цифр> или 8<Номер 10 цифр>: ");
            String userInput = scanner.nextLine();
            Task4 formatter = new Task4(userInput);
            String formattedNumber = formatter.format();
            System.out.println("Отформатированный номер: " + formattedNumber);
        }
    }
}