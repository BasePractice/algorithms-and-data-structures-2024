package ru.mirea.practice.s0000001.task0;

import java.util.Stack;

public class Calculus {
    public void calculate(StringBuilder numb) {
        Stack<Double> stack = new Stack<>();
        String[] st = numb.toString().split(" ");
        for (String sr : st) {
            switch (sr) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double num1 = stack.pop();
                    double num2 = stack.pop();
                    stack.push(num2 - num1);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double num01 = stack.pop();
                    double num02 = stack.pop();
                    stack.push(num02 / num01);
                    break;
                default:
                    stack.push(Double.parseDouble(sr));
                    break;
            }
        }
        System.out.println("res=" + stack.pop());
    }
}
