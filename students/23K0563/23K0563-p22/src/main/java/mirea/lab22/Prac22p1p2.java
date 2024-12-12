package mirea.lab22;

import java.util.Scanner;
import java.util.Stack;

public abstract class Prac22p1p2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите выражение в польской нотации: ");
            String[] exp = null;
            try {
                exp = sc.nextLine().split(" ");
            } catch (Exception e) {
                System.out.println("Ошибка ввода!");
            }
            Stack<Double> s = new Stack<Double>();
            if (exp != null) {
                try {
                    for (String i : exp) {
                        switch (i) {
                            case "+":
                                s.push(s.pop() + s.pop());
                                break;
                            case "-":
                                s.push(-(s.pop() - s.pop()));
                                break;
                            case "*":
                                s.push(s.pop() * s.pop());
                                break;
                            case "/":
                                double delit = s.pop();
                                double delim = s.pop();
                                s.push(delim / delit);
                                break;
                            default:
                                double n = Double.parseDouble(i);
                                s.push(n);
                                break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Ошибка счета: " + e.getMessage());
                }
            }
            System.out.println(s.pop());
        }

    }
}
