package ru.mirea.practice.s23k0120.task1;

import ru.mirea.practice.s23k0120.task1.utilclasses.OperationType;

public abstract class Main {
    public static void main(String[] args) {
        CalculatorController calculator = new CalculatorController();
        calculator.addNumber(100);
        calculator.addNumber(2);
        calculator.addNumber(3);
        calculator.addNumber(4);
        calculator.addNumber(5);
        calculator.addNumber(6);
        calculator.addOperation(OperationType.MULTIPLY);
        calculator.addOperation(OperationType.ADD);
        calculator.addOperation(OperationType.SUBTRACT);
        calculator.addOperation(OperationType.DIVIDE);
        System.out.println(calculator);
        System.out.println(calculator.compute());
        System.out.println(calculator);
        calculator.addOperation(OperationType.DIVIDE);
        System.out.println(calculator);
        System.out.println(calculator.compute());
        System.out.println(calculator);
        System.out.println(calculator.compute());
        System.out.println(calculator);
        System.out.println(calculator.compute());
        System.out.println(calculator);
        System.out.println(calculator.compute());
        System.out.println(calculator);
        System.out.println(calculator.compute());
        System.out.println(calculator);
    }
}
