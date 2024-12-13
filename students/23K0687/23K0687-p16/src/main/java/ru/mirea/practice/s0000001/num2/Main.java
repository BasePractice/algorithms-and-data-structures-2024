package ru.mirea.practice.s0000001.num2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public final class Main {
    private static final int MAX_TRIES = 3;
    private static int tries = 0;
    private static int targetNum;

    private Main() {
        // Приватный конструктор для запрета создания экземпляров класса
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Игра Угадайка");
        final JPanel p = new JPanel(new BorderLayout());
        final JTextArea ta = new JTextArea();
        final JScrollPane sp = new JScrollPane(ta);
        ta.setEditable(false);
        f.setSize(400, 300);

        targetNum = (int) (Math.random() * 21);

        JLabel l = new JLabel("Угадайте число от 0 до 20");
        JPanel cp = new JPanel();
        final JTextField tf = new JTextField(10);
        final JButton b = new JButton("Угадать");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = tf.getText();
                try {
                    int g = Integer.parseInt(input);
                    tries++;
                    if (g == targetNum) {
                        JOptionPane.showMessageDialog(f, "Вы угадали!");
                        System.exit(0);
                    } else if (tries >= MAX_TRIES) {
                        JOptionPane.showMessageDialog(f, "Вы исчерпали все попытки! Правильный ответ: " + targetNum);
                        System.exit(0);
                    } else {
                        String hint = g < targetNum ? "Больше" : "Меньше";
                        JOptionPane.showMessageDialog(f, "Неверно! Попробуйте " + hint);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Введите корректное число!");
                }
            }
        });

        cp.add(l);
        cp.add(tf);
        cp.add(b);

        final JMenuBar mb = new JMenuBar();
        final JMenu cm = new JMenu("Цвет");
        final JMenu fm = new JMenu("Шрифт");

        JMenuItem blue = new JMenuItem("Синий");
        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setForeground(Color.BLUE);
            }
        });
        JMenuItem red = new JMenuItem("Красный");
        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setForeground(Color.RED);
            }
        });
        JMenuItem black = new JMenuItem("Черный");
        black.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setForeground(Color.BLACK);
            }
        });

        cm.add(blue);
        cm.add(red);
        cm.add(black);

        JMenuItem tn = new JMenuItem("Times New Roman");
        tn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });
        JMenuItem ms = new JMenuItem("MS Sans Serif");
        ms.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });
        JMenuItem courier = new JMenuItem("Courier New");
        courier.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });

        fm.add(tn);
        fm.add(ms);
        fm.add(courier);

        mb.add(cm);
        mb.add(fm);

        f.setJMenuBar(mb);

        p.add(sp, BorderLayout.CENTER);
        p.add(cp, BorderLayout.SOUTH);

        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getComponent().equals(f.getContentPane())) {
                    if (e.getPoint().x < f.getWidth() / 3) {
                        JOptionPane.showMessageDialog(f, "Добро пожаловать в ЗАО");
                    } else if (e.getPoint().x > f.getWidth() * 2 / 3) {
                        JOptionPane.showMessageDialog(f, "Добро пожаловать в ВАО");
                    } else if (e.getPoint().y < f.getHeight() / 3) {
                        JOptionPane.showMessageDialog(f, "Добро пожаловать в САО");
                    } else if (e.getPoint().y > f.getHeight() * 2 / 3) {
                        JOptionPane.showMessageDialog(f, "Добро пожаловать ЮАО");
                    } else {
                        JOptionPane.showMessageDialog(f, "Добро пожаловать в ЦАО");
                    }
                }
            }
        });
    }
}

