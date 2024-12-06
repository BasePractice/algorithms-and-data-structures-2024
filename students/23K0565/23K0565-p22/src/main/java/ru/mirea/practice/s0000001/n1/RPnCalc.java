package ru.mirea.practice.s0000001.n1;

import java.util.Stack;

public abstract class RPnCalc {
    public static int calcRPn(String exp) {
        Stack<Integer> st = new Stack<>();
        String[] tok = exp.split(" ");

        for (String t : tok) {
            if (isNum(t)) {
                st.push(Integer.parseInt(t));
            } else {
                int b = st.pop();
                int a = st.pop();
                switch (t) {
                    case "+":
                        st.push(a + b);
                        break;
                    case "-":
                        st.push(a - b);
                        break;
                    case "*":
                        st.push(a * b);
                        break;
                    case "/":
                        st.push(a / b);
                        break;
                    default:
                        throw new IllegArg("Этот оператор неразрешён: " + t);
                }
            }
        }
        return st.pop();
    }

    private static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String exp = "3 5 + 2 *"; // Например
        System.out.println(calcRPn(exp));
    }
}
