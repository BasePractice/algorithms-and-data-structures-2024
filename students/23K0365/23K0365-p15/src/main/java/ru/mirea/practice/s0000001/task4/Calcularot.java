package ru.mirea.practice.s0000001.task4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Calcularot extends JFrame {
    private JLabel res = new JLabel("", SwingConstants.RIGHT);
    private String text = "";

    Calcularot() {
        super("Calculator");
        setLayout(new BorderLayout());
        setSize(400, 500);
        res.setFont(new Font("Arial", Font.BOLD, 24));
        res.setPreferredSize(new Dimension(400, 50));
        add(res, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };
        for (String btnText : buttons) {
            JButton button = new JButton(btnText);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            buttonPanel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if ("=".equals(btnText)) {
                        String[] a = text.split(" ");
                        for (int i = 0; i < a.length; i++) {
                            if ("*".equals(a[i])) {
                                if (i < 1 || i == a.length - 1) {
                                    JOptionPane.showMessageDialog(null, "WRONG ENTER. TRY AGAIN!", "ERORR", 1);
                                    text = "";
                                    res.setText(text);
                                } else {
                                    a[i + 1] = Double.toString(Double.parseDouble(a[i - 1]) * Double.parseDouble(a[i + 1]));
                                    String[] temp = new String[a.length - 2];
                                    System.arraycopy(a, 2, temp, 0, temp.length);
                                    a = temp;
                                }
                            } else if ("/".equals(a[i])) {
                                if (i < 1 || i == a.length - 1) {
                                    JOptionPane.showMessageDialog(null, "WRONG ENTER. TRY AGAIN!", "ERORR", 1);
                                    text = "";
                                    res.setText(text);
                                } else if (Double.parseDouble(a[i + 1]) == 0.) {
                                    JOptionPane.showMessageDialog(null, "CAN'T DEVIDE BY 0. TRY AGAIN", "ERORR", 1);
                                    text = "";
                                    res.setText(text);
                                } else {
                                    a[i + 1] = Double.toString(Double.parseDouble(a[i - 1]) / Double.parseDouble(a[i + 1]));
                                    String[] temp = new String[a.length - 2];
                                    System.arraycopy(a, 2, temp, 0, temp.length);
                                    a = temp;
                                }
                            }
                        }
                        for (int i = 0; i < a.length; i++) {
                            switch (a[i]) {
                                case "+":
                                    if (a[i - 1].isEmpty() || i == a.length - 1) {
                                        JOptionPane.showMessageDialog(null, "WRONG ENTER. TRY AGAIN!", "ERORR", 1);
                                        text = "";
                                        res.setText(text);
                                    } else {
                                        a[i + 1] = Double.toString(Double.parseDouble(a[i - 1]) + Double.parseDouble(a[i + 1]));
                                        String[] temp = new String[a.length - 2];
                                        System.arraycopy(a, 2, temp, 0, temp.length);
                                        a = temp;
                                    }
                                    break;
                                case "-":
                                    if (i == 0 || i == a.length - 1) {
                                        JOptionPane.showMessageDialog(null, "WRONG ENTER. TRY AGAIN!", "ERORR", 1);
                                        text = "";
                                        res.setText(text);
                                    } else {
                                        a[i + 1] = Double.toString(Double.parseDouble(a[i - 1]) - Double.parseDouble(a[i + 1]));
                                        String[] temp = new String[a.length - 2];
                                        System.arraycopy(a, 2, temp, 0, temp.length);
                                        a = temp;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        }
                        if (!text.isEmpty()) {
                            JOptionPane.showMessageDialog(null, Arrays.toString(a), "ANSWER", 1);
                            text = "";
                            res.setText(text);
                        }
                    } else if (".".equals(btnText)) {
                        if (!text.endsWith(".")) {
                            text += ".";
                            res.setText(text);
                        }
                    } else if ("+".equals(btnText) | "*".equals(btnText)
                        | "/".equals(btnText) | "-".equals(btnText)) {
                        text += " " + btnText + " ";
                        res.setText(text);
                    } else {
                        text += btnText;
                        res.setText(text);
                    }
                }
            });
        }

        add(buttonPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calcularot();
    }
}
