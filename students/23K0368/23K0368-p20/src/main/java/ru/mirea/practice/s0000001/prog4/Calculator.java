package ru.mirea.practice.s0000001.prog4;

public final class Calculator {

    // Приватный конструктор предотвращает создание экземпляров этого класса
    private Calculator() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static <E extends Number> E sum(E num1, E num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (E) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return (E) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (E) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else {
            throw new IllegalArgumentException("Не поддерживаемый тип данных");
        }
    }

    public static <E extends Number> E multiply(E num1, E num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (E) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return (E) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (E) Float.valueOf(num1.floatValue() * num2.floatValue());
        } else {
            throw new IllegalArgumentException("Не поддерживаемый тип данных");
        }
    }

    public static <E extends Number> E divide(E num1, E num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль");
        } else if (num1 instanceof Integer && num2 instanceof Integer) {
            return (E) Integer.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return (E) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (E) Float.valueOf(num1.floatValue() / num2.floatValue());
        } else {
            throw new IllegalArgumentException("Не поддерживаемый тип данных");
        }
    }

    public static <E extends Number> E subtraction(E num1, E num2) {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return (E) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double && num2 instanceof Double) {
            return (E) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return (E) Float.valueOf(num1.floatValue() - num2.floatValue());
        } else {
            throw new IllegalArgumentException("Не поддерживаемый тип данных");
        }
    }
}
