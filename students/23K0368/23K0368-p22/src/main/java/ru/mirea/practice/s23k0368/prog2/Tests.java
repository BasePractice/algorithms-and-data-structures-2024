package ru.mirea.practice.s23k0368.prog2;

public abstract class Tests {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();

        assert "Результат: 7.0".equals(model.evaluateRpn("3 4 +"));
        assert "Результат: 14.0".equals(model.evaluateRpn("5 1 2 + 4 * + 3 -"));

        assert "Ошибка: неверное выражение.".equals(model.evaluateRpn("3 +"));

        assert "Ошибка: деление на ноль.".equals(model.evaluateRpn("4 0 /"));

        assert "Ошибка: неверное выражение или операция для пустого стека.".equals(model.evaluateRpn("1 2 + *"));

        System.out.println("Все тесты пройдены.");
    }
}
