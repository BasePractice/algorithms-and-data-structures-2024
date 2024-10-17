package ru.mirea.practice.s0000001;

import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Разработайте программу калькулятора вида как представлено на рис.
 * 15.10
 */

public class Task4 implements ActionListener {
    static JFrame frame;
    static JTextField l;
    String[] ns;
    String la;
    int action;
    int cn;

    public static void main(String[] args) {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Font font = new Font("Arial", Font.PLAIN, 28);
        l = new JTextField(10);
        l.setFont(font);
        l.setEditable(false);
        l.setCaretColor(Color.WHITE);
        l.setHorizontalAlignment(JTextField.CENTER);

        // Как же я люблю проверку стиля, мой код становиться таким красивым.
        // Никакого больше непонятного и уродливого ujdyj кода!
        Task4 calc = new Task4();
        JButton b0 = new FontyButton("0");
        b0.addActionListener(calc);
        JButton b1 = new FontyButton("1");
        b1.addActionListener(calc);
        JButton b2 = new FontyButton("2");
        b2.addActionListener(calc);
        JButton b3 = new FontyButton("3");
        b3.addActionListener(calc);
        JButton b4 = new FontyButton("4");
        b4.addActionListener(calc);
        JButton b5 = new FontyButton("5");
        b5.addActionListener(calc);
        JButton b6 = new FontyButton("6");
        b6.addActionListener(calc);
        JButton b7 = new FontyButton("7");
        b7.addActionListener(calc);
        JButton b8 = new FontyButton("8");
        b8.addActionListener(calc);
        JButton b9 = new FontyButton("9");
        b9.addActionListener(calc);

        JButton f = new FontyButton(".");
        f.addActionListener(calc);
        JButton a = new FontyButton("+");
        a.addActionListener(calc);
        JButton s = new FontyButton("-");
        s.addActionListener(calc);
        JButton d = new FontyButton("/");
        d.addActionListener(calc);
        JButton m = new FontyButton("*");
        m.addActionListener(calc);
        JButton e = new FontyButton("=");
        e.addActionListener(calc);

        JPanel p = new JPanel();
        p.add(l);

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(a);

        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(s);

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(m);

        p.add(f);
        p.add(b0);
        p.add(e);
        p.add(d);

        frame.add(p);
        frame.setSize(270, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (ns[cn].length() == 9 && !cmd.matches("[=+/\\-*]")) {
            JOptionPane.showMessageDialog(
                    null,
                    "Достигнута максимальная длинна числа.",
                    "Alert",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (".".equals(cmd) && !ns[cn].isEmpty() && ns[cn].concat(cmd).matches("^\\d*\\.?\\d*$")) {
            ns[cn] = ns[cn].concat(cmd);
        } else if (cmd.matches("\\d")) {
            ns[cn] = ns[cn].concat(cmd);

            // Remove leading zeroes.
            if (ns[cn].matches("^\\d*\\.\\d*$")) {
                ns[cn] = String.valueOf(Double.parseDouble(ns[cn]));
            } else {
                ns[cn] = String.valueOf(Integer.parseInt(ns[cn]));
            }
        } else if ("=".equals(cmd)) {
            if ("/".equals(la) && 0.0 == Double.parseDouble(ns[1])) {
                JOptionPane.showMessageDialog(null, "Деление на 0.", "alert", JOptionPane.ERROR_MESSAGE);
                ns[1] = "";
            } else if (!ns[0].isEmpty() && !ns[1].isEmpty()) {
                calculate(la);
                ns[0] = "";
                la = "";
                cn = 0;
                return;
            }
        } else if (cmd.matches("[+*/-]")) {
            // STYLECHECKING SUCKS
            // WHY THIS HAS USELESS PARENTHESES, IT MUST HAVE ALL THOSE DUDES WTF?:
            // if ((cn == 0 && ns[0].isEmpty()) || (cn == 1 && ns[1].isEmpty())) {
            //     return;
            // }
            if (cn == 0 && ns[0].isEmpty()) {
                return;
            }
            if (cn == 1 && ns[1].isEmpty()) {
                return;
            }

            if (cn == 0) {
                la = cmd;
                cn++;
            } else {
                if ("/".equals(la) && 0.0 == Double.parseDouble(ns[1])) {
                    JOptionPane.showMessageDialog(null, "Деление на 0.", "alert", JOptionPane.ERROR_MESSAGE);
                    ns[1] = "";
                } else {
                    if (calculate(la)) {
                        la = cmd;
                    } else {
                        cn--;
                        la = "";
                        ns[0] = "";
                    }
                    return;
                }
            }
            System.out.println(cmd);
        }

        l.setText(ns[cn]);
    }

    private boolean calculate(String action) {
        double n1 = Double.parseDouble(ns[0]);
        double n2 = Double.parseDouble(ns[1]);
        ns[1] = "";
        double res = 0;

        if ("+".equals(action)) {
            res = n1 + n2;
        } else if ("-".equals(action)) {
            res = n1 - n2;
        } else if ("*".equals(action)) {
            res = n1 * n2;
        } else if ("/".equals(action)) {
            res = n1 / n2;
        }

        // Округление до 5-го знака после запятой...
        res = (int) res + (double) ((int) ((res - (int) res) * 100000 + 0.5)) / 100000;
        System.out.println(res);
        if (res > 999999999.0) {
            l.setText("               E");
            return false;
        }

        ns[0] = String.valueOf(res);
        l.setText(ns[0]);
        return true;
    }

    Task4() {
        ns = new String[]{"", ""};
        action = -1;
        la = "";
        cn = 0;
    }

    static class FontyButton extends JButton {
        FontyButton(String text) {
            setText(text);
            setFont(new Font("Arial", Font.PLAIN, 30));
        }
    }
}
