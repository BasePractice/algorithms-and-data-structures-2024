package ru.mirea.practice.s0000001.task2;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class TextEditor extends JFrame {

    private JTextArea textArea;

    public TextEditor() {
        // Устанавливаем заголовок окна
        setTitle("Редактор текста");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создаем текстовую область
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Создаем панель меню
        final JMenuBar menuBar = new JMenuBar();

        // Меню "Цвет"
        final JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        // Добавляем обработчики для выбора цвета
        blueItem.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redItem.addActionListener(e -> textArea.setForeground(Color.RED));
        blackItem.addActionListener(e -> textArea.setForeground(Color.BLACK));

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);

        // Меню "Шрифт"
        final JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
        JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
        JMenuItem courierNewItem = new JMenuItem("Courier New");

        // Добавляем обработчики для выбора шрифта
        timesNewRomanItem.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 12)));
        msSansSerifItem.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 12)));
        courierNewItem.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 12)));

        fontMenu.add(timesNewRomanItem);
        fontMenu.add(msSansSerifItem);
        fontMenu.add(courierNewItem);

        // Добавляем меню в панель меню
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);

        // Делаем окно видимым
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TextEditor::new);
    }
}
