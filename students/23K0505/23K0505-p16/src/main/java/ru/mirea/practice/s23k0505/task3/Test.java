package ru.mirea.practice.s23k0505.task3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Test {
    public static void main(String[] args) {
        final JLabel service = new JLabel("Service:");
        JTextField servicefield = new JTextField(10);
        final JLabel username = new JLabel("Username:");
        JTextField usernamefield = new JTextField(10);
        final JLabel password = new JLabel("Password:");
        JTextField passwordfield = new JTextField(10);
        UserofService user1 = new UserofService("hftf","Theonciest228","norm");
        JButton check = new JButton("check");
        JLabel result = new JLabel("");
        JFrame f = new JFrame();
        final int[] ticks = {0};
        f.setTitle("password application");
        f.setLayout(new FlowLayout());
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (servicefield.getText().equals(user1.getService())) {
                    ticks[0] += 1;
                }
                if (usernamefield.getText().equals(user1.getUsername())) {
                    ticks[0] += 1;
                }
                if (passwordfield.getText().equals(user1.getPassword())) {
                    ticks[0] += 1;
                }
                if (ticks[0] == 3) {
                    result.setText("Welcome back to " + user1.getService() + " " + user1.getUsername());
                } else {
                    result.setText("Data is not correct");
                }
            }
        });
        JPanel panel1 = new JPanel();
        panel1.add(service);
        panel1.add(servicefield);
        JPanel panel2 = new JPanel();
        panel2.add(username,BorderLayout.WEST);
        panel2.add(usernamefield,BorderLayout.CENTER);
        JPanel panel3 = new JPanel();
        panel3.add(password,BorderLayout.WEST);
        panel3.add(passwordfield,BorderLayout.CENTER);
        JPanel panel4 = new JPanel();
        panel4.add(check,BorderLayout.WEST);
        panel4.add(result,BorderLayout.CENTER);
        f.add(panel1);
        f.add(panel2);
        f.add(panel3);
        f.add(panel4);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
