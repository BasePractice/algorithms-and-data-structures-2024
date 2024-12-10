package ru.mirea.practice.s0000001;

import java.util.Scanner;
import java.util.Stack;

/**
 * Напишите программу-калькулятор арифметических
 * выражений записанных в обратной польской нотации (RPN-калькулятор).
 */

public abstract class Task1 {
    private static double calculate(String expr) {
        Stack<Double> stack = new Stack<Double>();
        String[] tokens = expr.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double oops = stack.pop();
                    stack.push(stack.pop() - oops);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double div = stack.pop();
                    if (div == 0) {
                        throw new IllegalArgumentException("Division by zero.");
                    }
                    stack.push(stack.pop() / div);
                    break;
                default:
                    try {
                        double val = Double.parseDouble(token);
                        stack.push(val);
                    } catch (Exception e) {
                        // New exception is thrown in catch block, original stack trace may be lost
                        throw new IllegalArgumentException("Illegal token: " + token + "; extra: ", e);
                    }
                    break;
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Illegal input: " + expr + ".");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter expression: ");
            String val = sc.nextLine();
            try {
                double res = calculate(val);
                System.out.println("Result: " + res);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
