package ru.mirea.practice.s0000001;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JTextField;

/**
 * Реализуйте программу на Джава с использованием JTextArea и двумя
 * следующего меню выбора:
 * a) Цвет: который имеет возможность выбора из три возможных:
 * синий, красный и черный
 * b) Шрифт: три вида: “Times New Roman”, “MS Sans Serif”, “Courier
 * New”.
 */

public class Task2 implements ActionListener {
    // Stylecheck said it is good... HATE IT. That is BAD
    private static final String[] colours = {"Синий", "Красный", "Черный"};
    private final Color[] colors = {Color.BLUE, Color.RED, Color.BLACK};
    private static final String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
    private static final JComboBox<String> colorChoice = new JComboBox<>(colours);
    private static final JComboBox<String> fontChoice = new JComboBox<>(fonts);
    private static JTextField input = new JTextField("This is for testing", 20);

    Task2() {
        input.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    }

    public static void main(String[] args) {
        Task2 app = new Task2();

        JFrame frame = new JFrame("Font manipulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        colorChoice.addActionListener(app);
        fontChoice.addActionListener(app);

        JPanel p = new JPanel();
        p.add(input);
        p.add(colorChoice);
        p.add(fontChoice);

        frame.add(p);

        frame.setMinimumSize(new Dimension(340, 150));
        frame.setSize(new Dimension(340, 150));
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int colorInd = colorChoice.getSelectedIndex();
        int fontInd = fontChoice.getSelectedIndex();

        input.setFont(new Font(fonts[fontInd], Font.PLAIN, 20));
        input.setForeground(colors[colorInd]);
    }
}
