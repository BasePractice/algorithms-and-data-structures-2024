package ru.mirea.practice.s0000001.task1;

import java.util.Stack;

public abstract class RpnCalculator {

    public static double evaluaterpn(String[] tokens) {
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double subtrahend = stack.pop();
                    stack.push(stack.pop() - subtrahend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] expression = {"2", "3", "+", "4", "5", "*", "+"}; // (2 + 3) + (4 * 5)
        System.out.println("Result: " + evaluaterpn(expression));
    }
}



