package ru.mirea.practice.s0000001;

import java.awt.Font;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 * Реализуйте программу Проверка пароля на Джава с использованием
 * Layout менеджеров компоновки. Окно программы должно иметь вид как на рис.
 * 16.4.
 */

public abstract class Task3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Guess the password!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);

        Font font = new Font("Arial", Font.PLAIN, 25);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        JTextField[] inputFields = new JTextField[3];

        String[] labels = {"Service:", "Username:", "Password:"};
        for (int i = 0; i < 3; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.LINE_END;
            gbc.insets = new Insets(0, 5, 2, 5);
            JLabel tmp = new JLabel(labels[i]);
            tmp.setFont(font);
            panel.add(tmp, gbc);

            gbc.gridx = 1;
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.LINE_START;
            inputFields[i] = new JTextField(20);
            inputFields[i].setFont(font);
            panel.add(inputFields[i], gbc);
        }

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 0, 0, 0);
        JButton btn = new JButton("Confirm");
        btn.setFont(font);
        panel.add(btn, gbc);

        btn.addActionListener(e -> {
            if (Objects.equals(inputFields[2].getText(), "password")) {
                JOptionPane.showMessageDialog(frame, "Пароль верный!", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Пароль неверный!", "Result", JOptionPane.ERROR_MESSAGE);
                inputFields[2].setText("");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
