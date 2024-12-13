package ru.mirea.practice.s0000001.task1.task2;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;

public class Main {
    private Frame f;
    private TextField d;
    private Panel p;
    private String op = "";
    private double o = 0;
    private boolean nI = true;

    public Main() {
        f = new Frame("Калькулятор");
        d = new TextField("0");
        p = new Panel();

        cui();
    }

    private void cui() {
        f.setLayout(new BorderLayout());
        d.setEditable(false);
        d.setFont(new Font("Arial", Font.PLAIN, 24));
        f.add(d, BorderLayout.NORTH);

        p.setLayout(new GridLayout(4, 4, 5, 5));
        String[] b = {
            "7", "8", "9", "/",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "C", "0", "=", "x"
        };

        for (String lbl : b) {
            Button btn = new Button(lbl);
            btn.setFont(new Font("Arial", Font.PLAIN, 20));
            btn.addActionListener(new Bcls());
            p.add(btn);
        }

        f.add(p, BorderLayout.CENTER);

        f.setSize(400, 500);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private class Bcls implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            if ("0123456789".contains(cmd)) {
                if (nI) {
                    d.setText(cmd);
                    nI = false;
                } else {
                    d.setText(d.getText() + cmd);
                }
            } else if ("+-/x".contains(cmd)) {
                op = cmd;
                o = Double.parseDouble(d.getText());
                nI = true;
            } else if ("=".equals(cmd)) {
                double c = Double.parseDouble(d.getText());
                double r = 0;

                switch (op) {
                    case "+":
                        r = o + c;
                        break;
                    case "-":
                        r = o - c;
                        break;
                    case "/":
                        if (c != 0) {
                            r = o / c;
                        } else {
                            d.setText("Error");
                            return;
                        }
                        break;
                    case "x":
                        r = o * c;
                        break;
                    default:
                        d.setText("Invalid Operator");
                        return;
                }

                d.setText(String.valueOf(r));
                nI = true;
            } else if ("C".equals(cmd)) {
                d.setText("0");
                op = "";
                o = 0;
                nI = true;
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
