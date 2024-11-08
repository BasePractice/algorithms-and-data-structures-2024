package ru.mirea.practice.s23k0120.task2;

//import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontChooseFrame extends JFrame {

    private final JTextArea textArea;

    FontChooseFrame() {
        BoxFont[] fonts = new BoxFont[]{BoxFont.getFont("Times New Roman"),
            BoxFont.getFont("MS Sans Serif"),
            BoxFont.getFont("Courier New")};

        textArea = new JTextArea(5, 30);
        textArea.setSize(100, 50);

        textArea.setFont(fonts[1].font);

        BoxColor[] colors = {new BoxColor("Blue", Color.BLUE),
            new BoxColor("Red", Color.RED),
            new BoxColor("Black", Color.BLACK)};
        JComboBox colorsBox = new JComboBox<>(colors);
        JComboBox fontsBox = new JComboBox<>(fonts);

        colorsBox.setSelectedIndex(2);
        colorsBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                BoxColor colorSelected = (BoxColor) cb.getSelectedItem();
                textArea.setForeground(colorSelected.color);
            }
        });

        fontsBox.setSelectedIndex(1);
        fontsBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox) e.getSource();
                BoxFont fontSelected = (BoxFont) cb.getSelectedItem();
                textArea.setFont(fontSelected.font);
            }
        });

        add(textArea);
        add(colorsBox);
        add(fontsBox);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup()
            .addComponent(textArea)
            .addComponent(fontsBox)
            .addComponent(colorsBox));

        layout.setVerticalGroup(layout.createSequentialGroup()
            .addComponent(textArea)
            .addComponent(fontsBox)
            .addComponent(colorsBox));

        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
