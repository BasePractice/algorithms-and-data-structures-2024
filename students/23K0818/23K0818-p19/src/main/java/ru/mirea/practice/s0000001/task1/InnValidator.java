package ru.mirea.practice.s0000001.task1;

public abstract class InnValidator {

    public static void validateInn(String inn) throws InvalidInnException {
        if (inn == null || !inn.matches("\\d{10}") && !inn.matches("\\d{12}")) {
            throw new InvalidInnException("Неверный формат ИНН");
        }

        if (inn.length() == 10) {
            validate10DigitInn(inn);
        } else if (inn.length() == 12) {
            validate12DigitInn(inn);
        }
    }

    private static void validate10DigitInn(String inn) throws InvalidInnException {
        int[] coefficients = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int controlSum = 0;

        for (int i = 0; i < 9; i++) {
            controlSum += (inn.charAt(i) - '0') * coefficients[i];
        }

        int controlNumber = controlSum % 11 % 10;

        if (controlNumber != inn.charAt(9) - '0') {
            throw new InvalidInnException("Недействительный ИНН");
        }
    }

    private static void validate12DigitInn(String inn) throws InvalidInnException {
        int[] coefficients1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] coefficients2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};

        int controlSum1 = 0;
        int controlSum2 = 0;

        for (int i = 0; i < 10; i++) {
            controlSum1 += (inn.charAt(i) - '0') * coefficients1[i];
        }

        for (int i = 0; i < 11; i++) {
            controlSum2 += (inn.charAt(i) - '0') * coefficients2[i];
        }

        int controlNumber1 = controlSum1 % 11 % 10;
        int controlNumber2 = controlSum2 % 11 % 10;

        if (controlNumber1 != (inn.charAt(10) - '0') || controlNumber2 != (inn.charAt(11) - '0')) {
            throw new InvalidInnException("Недействительный ИНН");
        }
    }

    public static class InvalidInnException extends Exception {
        public InvalidInnException(String message) {
            super(message);
        }
    }
}
