package ru.mirea.practice.s0000001;

import javax.swing.UIManager;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

/**
 * Напишите графический интерфейс для калькулятора,
 * используя знания полученные ранее при програмиировании GUI с
 * использованием SWING и AWT. Используйте паттерн проектирования
 * MVC. Интерфейс может выглядеть как на рис. 22.1 или как на рис. 22.2
 */

public abstract class Task2 {
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


        l = new JTextField(10);
        l.setEditable(false);
        l.setCaretColor(Color.WHITE);

        Font font = new Font("Arial", Font.PLAIN, 28);
        l.setFont(font);
        l.setHorizontalAlignment(JTextField.CENTER);

        JButton b0 = new FontyButton("0");
        JButton b1 = new FontyButton("1");
        JButton b2 = new FontyButton("2");
        JButton b3 = new FontyButton("3");
        JButton b4 = new FontyButton("4");
        JButton b5 = new FontyButton("5");
        JButton b6 = new FontyButton("6");
        JButton b7 = new FontyButton("7");
        JButton b8 = new FontyButton("8");
        JButton b9 = new FontyButton("9");

        JButton f = new FontyButton(".");
        JButton a = new FontyButton("+");
        JButton s = new FontyButton("-");
        JButton d = new FontyButton("/");
        JButton m = new FontyButton("*");
        JButton e = new FontyButton("=");

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

    Task2() {
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
