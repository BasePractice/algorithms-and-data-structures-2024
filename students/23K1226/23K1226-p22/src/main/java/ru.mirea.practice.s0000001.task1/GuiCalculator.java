package ru.mirea.practice.s0000001.task1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class GuiCalculator extends JFrame {
    private JTextField display;

    public GuiCalculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 400);

        display = new JTextField();
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "+", "="};
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("=".equals(command)) {
                try {
                    // Преобразуем выражение в формат RPN
                    String infixExpression = display.getText().replaceAll("\\s+", "");
                    String rpnExpression = infixToPostfix(infixExpression);
                    System.out.println("RPN Expression: " + rpnExpression); // Логирование RPN

                    double result = evaluateRpn(rpnExpression);
                    display.setText(String.valueOf(result));
                } catch (Exception ex) {
                    display.setText("Error");
                    System.out.println("Error: " + ex.getMessage());
                }
            } else {
                String currentText = display.getText();
                display.setText(currentText + " " + command); // Добавляем пробел между символами
            }
        }
    }

    public static double evaluateRpn(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.trim().split(" "); // Разделяем по пробелам и удаляем лишние пробелы
        System.out.println("Tokens: " + String.join(", ", tokens)); // Логирование токенов

        for (String token : tokens) {
            if (isNumeric(token)) {
                double number = Double.parseDouble(token);
                stack.push(number);
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для операции");
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = 0;
                if ("+".equals(token)) {
                    result = a + b;
                } else if ("-".equals(token)) {
                    result = a - b;
                } else if ("*".equals(token)) {
                    result = a * b;
                } else if ("/".equals(token)) {
                    result = a / b;
                } else {
                    throw new IllegalArgumentException("Недопустимая операция: " + token);
                }
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }
        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Преобразование инфиксной записи в постфиксную
    private String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                // Если это цифра, добавляем её в результат
                result.append(c).append(" ");
            } else if (c == '(') {
                operators.push(c); // Если это открывающая скобка, помещаем в стек
            } else if (c == ')') {
                // Если это закрывающая скобка, достаём из стека до открывающей скобки
                while (!operators.isEmpty() && operators.peek() != '(') {
                    result.append(operators.pop()).append(" ");
                }
                operators.pop(); // Убираем открывающую скобку
            } else if (isOperator(c)) {
                // Если это оператор, достаём операторы из стека с более высоким приоритетом
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    result.append(operators.pop()).append(" ");
                }
                operators.push(c); // Помещаем текущий оператор в стек
            }
        }

        // Выводим оставшиеся операторы из стека
        while (!operators.isEmpty()) {
            result.append(operators.pop()).append(" ");
        }

        return result.toString().trim();
    }

    // Проверка, является ли символ оператором
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // Приоритет операторов
    private int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        new GuiCalculator();
    }
}
