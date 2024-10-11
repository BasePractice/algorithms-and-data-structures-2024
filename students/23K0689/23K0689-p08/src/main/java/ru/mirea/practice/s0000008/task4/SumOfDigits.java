package ru.mirea.practice.s0000008.task4;

public final class SumOfDigits {

    private SumOfDigits() {
        // закрытый конструктор для предотвращения создания экземпляров
    }

    public static void main(String[] args) {
        int k = 3; // количество цифр
        int s = 6; // заданная сумма цифр
        System.out.println(countNumbersWithSum(k, s));
    }

    public static int countNumbersWithSum(int k, int s) {
        return countRecursive(k, s, 0, true);
    }

    private static int countRecursive(int k, int s, int currentSum, boolean isFirstDigit) {
        if (k == 0) {
            return currentSum == s ? 1 : 0;
        }

        int minDigit = isFirstDigit ? 1 : 0;
        int maxDigit = 9;
        int count = 0;

        for (int digit = minDigit; digit <= maxDigit; digit++) {
            if (currentSum + digit <= s) {
                count += countRecursive(k - 1, s, currentSum + digit, false);
            }
        }
        return count;
    }
}