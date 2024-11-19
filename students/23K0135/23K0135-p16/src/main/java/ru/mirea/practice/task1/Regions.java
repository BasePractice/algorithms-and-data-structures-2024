package ru.mirea.practice.task1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Regions extends JFrame {

    private JPanel contentPane;

    public Regions() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 150, 450, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout()); // BorderLayout is now local

        // надписи для каждой области
        JLabel centerLabel = new JLabel("CENTER");
        centerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPane.add(centerLabel, BorderLayout.CENTER);

        JLabel westLabel = new JLabel("WEST");
        westLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPane.add(westLabel, BorderLayout.WEST);

        JLabel southLabel = new JLabel("SOUTH");
        southLabel.setHorizontalAlignment(SwingConstants.CENTER);
        southLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPane.add(southLabel, BorderLayout.SOUTH);

        JLabel northLabel = new JLabel("NORTH");
        northLabel.setHorizontalAlignment(SwingConstants.CENTER);
        northLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPane.add(northLabel, BorderLayout.NORTH);

        JLabel eastLabel = new JLabel("EAST");
        eastLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPane.add(eastLabel, BorderLayout.EAST);

        // обработка событий мыши
        centerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(contentPane, "Добро пожаловать в ЦАО");
            }
        });

        westLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(contentPane, "Добро пожаловать в ЗАО");
            }
        });

        southLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(contentPane, "Добро пожаловать в ЮАО");
            }
        });

        northLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(contentPane, "Добро пожаловать в САО");
            }
        });

        eastLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(contentPane, "Добро пожаловать в ВАО");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Regions frame = new Regions();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
