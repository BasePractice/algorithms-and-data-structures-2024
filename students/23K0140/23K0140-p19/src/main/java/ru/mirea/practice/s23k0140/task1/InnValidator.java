package ru.mirea.practice.s23k0140.task1;

public final class InnValidator {
    private InnValidator() {

    }

    public static void main(String[] args) {
        try {
            String inn = "123456789012";
            validateInn(inn);
            System.out.println("ИНН действителен.");
        } catch (InvalidInnException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateInn(String inn) throws InvalidInnException {
        if (inn.length() == 10) {
            if (!isValidJuridicalInn(inn)) {
                throw new InvalidInnException("Недействительный ИНН юридического лица.");
            }
        } else if (inn.length() == 12) {
            if (!isValidIndividualInn(inn)) {
                throw new InvalidInnException("Недействительный ИНН физического лица.");
            }
        } else {
            throw new InvalidInnException("ИНН должен содержать 10 или 12 цифр.");
        }
    }

    private static boolean isValidJuridicalInn(String inn) {
        int[] coefficients = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        return checkControlSum(inn, coefficients, 9);
    }

    private static boolean isValidIndividualInn(String inn) {
        int[] coefficients11 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] coefficients12 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        boolean firstCheck = checkControlSum(inn, coefficients11, 10);
        boolean secondCheck = checkControlSum(inn, coefficients12, 11);
        return firstCheck && secondCheck;
    }

    private static boolean checkControlSum(String inn, int[] coefficients, int n) {
        int controlSum = 0;
        for (int i = 0; i < coefficients.length; i++) {
            controlSum += Character.getNumericValue(inn.charAt(i)) * coefficients[i];
        }
        int controlDigit = controlSum % 11;
        if (controlDigit > 9) {
            controlDigit %= 10;
        }
        return controlDigit == Character.getNumericValue(inn.charAt(n));
    }
}