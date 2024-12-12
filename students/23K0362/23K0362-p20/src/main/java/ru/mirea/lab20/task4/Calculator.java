package mirea.lab20.task4;

/*
Написать класс Калькулятор
(необобщенный), который содержит обобщенные статические методы -
sum, multiply, divide, subtraction. Параметры этих методов - два числа
разного типа, над которыми должна быть произведена операция.
 */

public class Calculator {
    public <T extends Number, S extends Number> double sum(T firstValue, S secondValue) {
        return firstValue.doubleValue() + secondValue.doubleValue();
    }

    public <T extends Number, S extends Number> double divide(T firstValue, S secondValue) {
        return firstValue.doubleValue() - secondValue.doubleValue();
    }

    public <T extends Number, S extends Number> double multiply(T firstValue, S secondValue) {
        return firstValue.doubleValue() * secondValue.doubleValue();
    }

    public <T extends Number, S extends Number> double substraction(T firstValue, S secondValue) {
        try {
            if (secondValue.doubleValue() == 0) {
                throw new NullPointerException("Must be not 0 values in denominator.");
            }
            return firstValue.doubleValue() / secondValue.doubleValue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }
}
