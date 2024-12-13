package ru.mirea.practice.s0000001;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class RpnCalculatorGui extends JFrame {
    private JTextField display;
    private RpnCalculator calculator;

    public RpnCalculatorGui() {
        calculator = new RpnCalculator();
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(5, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "Space", "", ""
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            if ("Space".equals(text)) { // Литерал теперь идет первым
                button.setPreferredSize(new Dimension(80, 50)); // Делает кнопку Space длиннее
            }
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }
        add(panel, BorderLayout.CENTER);

        setTitle("RPN Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "=":
                    try {
                        double result = calculator.evaluate(display.getText().trim());
                        display.setText(String.valueOf(result));
                    } catch (ArithmeticException ex) {
                        display.setText("Ошибка: деление на ноль");
                    } catch (NumberFormatException ex) {
                        display.setText("Ошибка: неверный формат числа");
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        display.setText("Ошибка: недостаточно данных для операции");
                    } catch (IllegalStateException ex) {
                        display.setText("Ошибка: выражение некорректно");
                    } catch (Exception ex) {
                        display.setText("Неизвестная ошибка: " + ex.getMessage());
                    }
                    break;
                case "C":
                    display.setText("");
                    break;
                case "Space":
                    display.setText(display.getText() + " ");
                    break;
                default:
                    display.setText(display.getText() + command);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RpnCalculatorGui calc = new RpnCalculatorGui();
            calc.setVisible(true);
        });
    }
}
