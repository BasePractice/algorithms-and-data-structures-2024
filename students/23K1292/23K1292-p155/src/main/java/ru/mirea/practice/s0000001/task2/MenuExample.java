package ru.mirea.practice.s0000001.task2;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample extends JFrame {

    private JTextField textField;

    public MenuExample() {
        // Устанавливаем заголовок окна
        setTitle("Пример меню на Java");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Создаем текстовое поле
        textField = new JTextField(20);
        add(textField);

        // Создаем кнопки
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        add(button1);
        add(button2);

        // Создаем и инициализируем меню
        final JMenuBar menuBar = new JMenuBar();

        // Меню "Файл"
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveItem = new JMenuItem("Сохранить");
        JMenuItem exitItem = new JMenuItem("Выйти");
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Обработчик для выхода
        exitItem.addActionListener(e -> System.exit(0));

        // Меню "Правка"
        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        // Меню "Справка"
        JMenu helpMenu = new JMenu("Справка");
        JMenuItem aboutItem = new JMenuItem("О программе");
        helpMenu.add(aboutItem);

        // Добавляем меню в панель меню
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // Обработчики для кнопок
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Вы нажали Кнопку 1");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Вы нажали Кнопку 2");
            }
        });

        // Обработчики для меню "Правка"
        copyItem.addActionListener(e -> textField.copy());
        cutItem.addActionListener(e -> textField.cut());
        pasteItem.addActionListener(e -> textField.paste());

        // Обработчик для "О программе"
        aboutItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Программа для демонстрации меню на Java."));

        // Делаем окно видимым
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(MenuExample::new);
    }
}
