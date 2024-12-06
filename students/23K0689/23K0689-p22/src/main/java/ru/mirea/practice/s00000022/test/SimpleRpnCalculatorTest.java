package ru.mirea.practice.s00000022.test;

// Импортируем калькулятор из task1
import ru.mirea.practice.s00000022.task1.SimpleRpnCalculator;

public class SimpleRpnCalculatorTest {

    private SimpleRpnCalculator calculator;

    public SimpleRpnCalculatorTest() {
        this.calculator = new SimpleRpnCalculator();  // Создаём калькулятор из task1
    }

    public void testSimpleCalculation() {
        // Тест 1: 2 3 +
        double result = calculator.evaluate("2 3 +");
        assertTest(result, 5.0, "Test 1");

        // Тест 2: 2 3 *
        result = calculator.evaluate("2 3 *");
        assertTest(result, 6.0, "Test 2");

        // Тест 3: 6 3 /
        result = calculator.evaluate("6 3 /");
        assertTest(result, 2.0, "Test 3");

        // Тест 4: 10 2 3 + *
        result = calculator.evaluate("10 2 3 + *");
        assertTest(result, 50.0, "Test 4");

        // Тест 5: 5 2 - (проверка вычитания)
        result = calculator.evaluate("5 2 -");
        assertTest(result, 3.0, "Test 5");

        // Тест 6: 4 2 2 * + (проверка комбинации операций)
        result = calculator.evaluate("4 2 2 * +");
        assertTest(result, 8.0, "Test 6");

        // Тест 7: 0 5 + (проверка с нулем)
        result = calculator.evaluate("0 5 +");
        assertTest(result, 5.0, "Test 7");
    }

    public void testErrorHandling() {
        // Тест 1: 2 3 + + (ошибка при лишней операции)
        double result = calculator.evaluate("2 3 + +");
        assertError(result, "Test 1");

        // Тест 2: 2 0 / (деление на ноль)
        result = calculator.evaluate("2 0 /");
        assertError(result, "Test 2");

        // Тест 3: + (недостаточно операндов)
        result = calculator.evaluate("+");
        assertError(result, "Test 3");

        // Тест 4: пустая строка
        result = calculator.evaluate("");
        assertError(result, "Test 4");
    }

    public void testEdgeCases() {
        // Тест 1: очень большие числа
        double result = calculator.evaluate("1000000000 1000000000 +");
        assertTest(result, 2000000000.0, "Edge Case 1");

        // Тест 2: очень маленькие числа
        result = calculator.evaluate("0.00000001 0.00000001 +");
        assertTest(result, 0.00000002, "Edge Case 2");

        // Тест 3: отрицательные числа
        result = calculator.evaluate("-5 -3 +");
        assertTest(result, -8.0, "Edge Case 3");

        // Тест 4: комбинация больших и маленьких чисел
        result = calculator.evaluate("1000000000 0.00000001 +");
        assertTest(result, 1000000000.00000001, "Edge Case 4");

        // Тест 5: отрицательные числа и операции
        result = calculator.evaluate("-10 5 +");
        assertTest(result, -5.0, "Edge Case 5");
    }

    // Утверждения для проверки результатов
    private void assertTest(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + " Passed: Expected " + expected + ", got " + result);
        } else {
            System.out.println(testName + " Failed: Expected " + expected + ", but got " + result);
        }
    }

    // Проверка ошибок
    private void assertError(double result, String testName) {
        if (Double.isNaN(result)) {
            System.out.println(testName + " Passed: Expected NaN, got " + result);
        } else {
            System.out.println(testName + " Failed: Expected NaN, but got " + result);
        }
    }

    public static void main(String[] args) {
        SimpleRpnCalculatorTest test = new SimpleRpnCalculatorTest();
        test.testSimpleCalculation();   // Тесты для обычных вычислений
        test.testErrorHandling();       // Тесты для обработки ошибок
        test.testEdgeCases();           // Тесты на крайние случаи
    }
}
