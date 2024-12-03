package ru.mirea.practice.s28k0112;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonAdd = new JButton("Add them up");
    JButton buttonSub = new JButton("Subtract");
    JButton buttonDiv = new JButton("Division");
    JButton buttonMul = new JButton("Multiply");

    Font fnt = new Font("Times New Roman", Font.BOLD, 20);

    // Конструктор класса Calculator
    Calculator() {
        setLayout(new FlowLayout());
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие приложения при нажатии на кнопку закрытия

        // Создаем надпись 1
        add(new JLabel("1st Number"));
        // Добавляем текстовое поле jta1
        add(jta1);
        // Создаем надпись 2
        add(new JLabel("2nd Number"));
        // Добавляем текстовое поле jta2
        add(jta2);
        // Добавляем кнопку
        add(buttonAdd);
        add(buttonSub);
        add(buttonDiv);
        add(buttonMul);


        // Добавляем слушателя к кнопке buttonAdd
        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    // Переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    // Создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    // Создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        }); // Конец buttonAdd.addActionListener()

        buttonSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    // Переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    // Создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    // Создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true); // Делаем окно видимым

        buttonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    // Переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    // Создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    // Создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    // Переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    // Переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    // Создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    // Создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers!", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true); // Делаем окно видимым
    }

    public static void main(String[] args) {
        new Calculator(); // Создаем экземпляр калькулятора
    } // Конец main()
} // Конец класса Calculator