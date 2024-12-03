package ru.mirea.practice.s29k0112;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        // Task 1-2
        GenericClass<String, Integer, Double> genericObject = new GenericClass<>("Hello", 123, 45.67);

        System.out.println("Первая переменная: " + genericObject.getFirst());
        System.out.println("Вторая переменная: " + genericObject.getSecond());
        System.out.println("Третья переменная: " + genericObject.getThird());

        genericObject.printClassNames();

        // Task 3
        System.out.println("\n");
        int intNumber = 10;
        double doubleNumber = 5.5;

        // Используем методы калькулятора
        System.out.println("Сумма: " + Calculator.sum(intNumber, doubleNumber));
        System.out.println("Умножение: " + Calculator.multiply(intNumber, doubleNumber));
        System.out.println("Деление: " + Calculator.divide(intNumber, doubleNumber));
        System.out.println("Вычитание: " + Calculator.subtraction(intNumber, doubleNumber));
    }
}
