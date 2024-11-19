package ru.mirea.practice.s230k754.lab11;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add them up");
    JButton button2 = new JButton(" Add them minus");
    JButton button3 = new JButton(" Add them del");
    JButton button4 = new JButton(" Add them sum");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    //начало конструктора класса LabExample

    LabExample() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,250);
        // создаем надпись 1
        add(new JLabel("1st Number"));
        // добавляем текстовое поле jta1
        add(jta1);
        // создаем надпись 2
        add(new JLabel("2nd Number"));
        // добавляем текстовое поле jta2
        add(jta2);
        // добавляем кнопку
        add(button);
        add(button2);
        add(button3);
        add(button4);
        button4.addActionListener(new ActionListener() {
            //добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    //переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(
                        null,"Error in Numbers!","alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        button3.addActionListener(new ActionListener() {
            //добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    //переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(
                        null,"Error in Numbers!","alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        button2.addActionListener(new ActionListener() {
            //добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                    //переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(
                        null,"Error in Numbers!","alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        //добавляем слушателя к кнопке
        button.addActionListener(new ActionListener() {
            //добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae) {
                try {
                        //переменная для хранения ввода в текстовое поле 1
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        //переменная для хранения ввода в текстовое поле 2
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(
                        null, "Error in Numbers!","alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        setVisible(true);
    } // конец конструктора
}

