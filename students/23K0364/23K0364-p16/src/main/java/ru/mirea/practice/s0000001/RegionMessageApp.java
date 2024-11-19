package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegionMessageApp extends JFrame {
    public RegionMessageApp() {
        setTitle("Region Message App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // Declaring panels as final for PMD rule
        final JPanel center = new JPanel();
        final JPanel west = new JPanel();
        final JPanel south = new JPanel();
        final JPanel north = new JPanel();
        final JPanel east = new JPanel();

        // Adding borders to panels
        Border border = new LineBorder(Color.BLACK, 2);

        // Setting borders for each panel
        center.setBorder(border);
        west.setBorder(border);
        south.setBorder(border);
        north.setBorder(border);
        east.setBorder(border);

        // Adding labels for each region
        center.add(new JLabel("Центральный округ"));
        west.add(new JLabel("Западный округ"));
        south.add(new JLabel("Южный округ"));
        north.add(new JLabel("Северный округ"));
        east.add(new JLabel("Восточный округ"));

        add(center, BorderLayout.CENTER);
        add(west, BorderLayout.WEST);
        add(south, BorderLayout.SOUTH);
        add(north, BorderLayout.NORTH);
        add(east, BorderLayout.EAST);

        // Adding MouseListeners to show messages when mouse enters each panel
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО");
            }
        });

        west.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО");
            }
        });

        south.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать ЮАО");
            }
        });

        north.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО");
            }
        });

        east.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegionMessageApp();
    }
}
