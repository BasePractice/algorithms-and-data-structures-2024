package ru.mirea.practice.s0000001;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class SimpleTextEditor extends JFrame {
    private JTextArea editorArea;
    private JComboBox<String> fontSelector;
    private JComboBox<String> colorSelector;

    public SimpleTextEditor() {
        setTitle("Простой текстовый редактор");
        setSize(450, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        editorArea = new JTextArea();
        editorArea.setLineWrap(true);
        editorArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(editorArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(1, 4));

        final JLabel fontLabel = new JLabel("Шрифт:");
        fontSelector = new JComboBox<>();
        fontSelector.addItem("Times New Roman");
        fontSelector.addItem("Courier New");
        fontSelector.addItem("MS Sans Serif");

        final JLabel colorLabel = new JLabel("Цвет:");
        colorSelector = new JComboBox<>();
        colorSelector.addItem("Синий");
        colorSelector.addItem("Красный");
        colorSelector.addItem("Черный");

        // Добавление слушателей для выбора шрифта и цвета
        fontSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFont((String) fontSelector.getSelectedItem());
            }
        });

        colorSelector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateColor((String) colorSelector.getSelectedItem());
            }
        });

        controlPanel.add(fontLabel);
        controlPanel.add(fontSelector);
        controlPanel.add(colorLabel);
        controlPanel.add(colorSelector);

        add(controlPanel, BorderLayout.SOUTH);
    }

    private void updateColor(String selectedColor) {
        switch (selectedColor) {
            case "Синий":
                editorArea.setForeground(Color.BLUE);
                break;
            case "Красный":
                editorArea.setForeground(Color.RED);
                break;
            case "Черный":
                editorArea.setForeground(Color.BLACK);
                break;
            default:
                break;
        }
    }

    private void updateFont(String selectedFont) {
        switch (selectedFont) {
            case "Times New Roman":
                editorArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                break;
            case "Courier New":
                editorArea.setFont(new Font("Courier New", Font.PLAIN, 14));
                break;
            case "MS Sans Serif":
                editorArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleTextEditor textEditor = new SimpleTextEditor();
            textEditor.setVisible(true);
        });
    }
}
