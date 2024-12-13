package ru.mirea.practice.lab22.calculator;

abstract class RpNCalculatorTest {
    public static void main(String[] args) {
        RpNCalculator calculator = new RpNCalculator();

        try {
            test(calculator.evaluate("2 3 +") == 5, "Тест 1: 2 3 +");
            test(calculator.evaluate("5 1 2 + 4 * + 3 -") == 14, "Тест 2: 5 1 2 + 4 * + 3 -");

            try {
                calculator.evaluate("4 0 /");
                System.out.println("Тест 3: Ошибка не выброшена при делении на ноль");
            } catch (ArithmeticException e) {
                test("Деление на ноль".equals(e.getMessage()), "Тест 3: Деление на ноль");
            }

            try {
                calculator.evaluate("1 2 + *");
                System.out.println("Тест 4: Ошибка не выброшена при недостатке операндов");
            } catch (IllegalArgumentException e) {
                test(e.getMessage().contains("Недостаточно операндов"), "Тест 4: Недостаточно операндов");
            }

            try {
                calculator.evaluate("2 3 &");
                System.out.println("Тест 5: Ошибка не выброшена при некорректном операторе");
            } catch (IllegalArgumentException e) {
                test(e.getMessage().contains("Некорректный оператор"), "Тест 5: Некорректный оператор");
            }

            try {
                calculator.evaluate("");
                System.out.println("Тест 6: Ошибка не выброшена при пустом выражении");
            } catch (IllegalArgumentException e) {
                test(e.getMessage().contains("Некорректное выражение"), "Тест 6: Пустое выражение");
            }

            System.out.println("Все тесты пройдены успешно!");
        } catch (AssertionError e) {
            System.err.println("Тест провален: " + e.getMessage());
        }
    }

    private static void test(boolean condition, String testName) {
        if (!condition) {
            throw new AssertionError(testName + " не пройден");
        }
        System.out.println(testName + " пройден");
    }
}

