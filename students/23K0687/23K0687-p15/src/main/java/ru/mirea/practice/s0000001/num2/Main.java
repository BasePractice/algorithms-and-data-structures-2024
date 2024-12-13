package ru.mirea.practice.s0000001.num2;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Hello Swing");
        String[] c = {"Australia", "China", "England", "Russia"};
        JComboBox<String> cb = new JComboBox<>(c);

        cb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sc = (String) cb.getSelectedItem();
                switch (sc) {
                    case "Australia":
                        System.out.println("Вы выбрали Австралию");
                        break;
                    case "China":
                        System.out.println("Вы выбрали Китай");
                        break;
                    case "England":
                        System.out.println("Вы выбрали Англию");
                        break;
                    case "Russia":
                        System.out.println("Вы выбрали Россию");
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                        break;
                }
            }
        });

        f.add(cb);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
