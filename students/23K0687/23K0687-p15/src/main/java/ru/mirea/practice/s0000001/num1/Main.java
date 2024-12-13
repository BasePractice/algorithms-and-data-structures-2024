package ru.mirea.practice.s0000001.num1;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;  // Импорт класса JPanel

import java.awt.BorderLayout;
import java.awt.GridLayout;

public abstract class Main {
    public static void main(String[] args) {
        final JFrame win = new JFrame("Пример программы");
        final JMenuBar mb = new JMenuBar();

        final JMenu file = new JMenu("Файл");
        final JMenuItem save = new JMenuItem("Сохранить");
        final JMenuItem exit = new JMenuItem("Выйти");
        file.add(save);
        file.add(exit);

        final JMenu edit = new JMenu("Правка");
        final JMenuItem copy = new JMenuItem("Копировать");
        final JMenuItem cut = new JMenuItem("Вырезать");
        final JMenuItem paste = new JMenuItem("Вставить");
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);

        final JMenu help = new JMenu("Справка");

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        win.setJMenuBar(mb);

        final JButton btn1 = new JButton("Кнопка 1");
        final JButton btn2 = new JButton("Кнопка 2");
        final JTextField tf = new JTextField("Это текстовое поле.");

        final JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 1));
        p.add(btn1);
        p.add(btn2);

        win.add(p, BorderLayout.NORTH);
        win.add(tf, BorderLayout.CENTER);

        win.setSize(400, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
    }
}
