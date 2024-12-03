package ru.mirea.practice.s230k754.lab11;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class MouseEvents extends JFrame implements MouseListener {
    private final JPanel centerPanel;
    private final JPanel westPanel;
    private final JPanel southPanel;
    private final JPanel northPanel;
    private final JPanel eastPanel;

    public MouseEvents() {
        super("Пример с событиями мыши");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Создаем макет BorderLayout
        setLayout(new BorderLayout());

        // Создаем панели для каждой области
        centerPanel = new JPanel();
        westPanel = new JPanel();
        southPanel = new JPanel();
        northPanel = new JPanel();
        eastPanel = new JPanel();

        // Устанавливаем цвет для каждой панели (опционально)
        centerPanel.setBackground(Color.YELLOW);
        westPanel.setBackground(Color.GREEN);
        southPanel.setBackground(Color.BLUE);
        northPanel.setBackground(Color.RED);
        eastPanel.setBackground(Color.PINK);

        // Добавляем панели в макет
        add(centerPanel, BorderLayout.CENTER);
        add(westPanel, BorderLayout.WEST);
        add(southPanel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);
        add(eastPanel, BorderLayout.EAST);

        // Добавляем обработчики событий мыши для каждой панели
        centerPanel.addMouseListener(this);
        westPanel.addMouseListener(this);
        southPanel.addMouseListener(this);
        northPanel.addMouseListener(this);
        eastPanel.addMouseListener(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Обработка события "мышь вошла в область"
        if (Objects.equals(e.getSource(), centerPanel)) {
            JOptionPane.showMessageDialog(this, "Добро пожаловать в ЦАО");
        } else if (Objects.equals(e.getSource(), westPanel)) {
            JOptionPane.showMessageDialog(this, "Добро пожаловать в ЗАО");
        } else if (Objects.equals(e.getSource(), southPanel)) {
            JOptionPane.showMessageDialog(this, "Добро пожаловать в ЮАО");
        } else if (Objects.equals(e.getSource(), northPanel)) {
            JOptionPane.showMessageDialog(this, "Добро пожаловать в САО");
        } else if (Objects.equals(e.getSource(), eastPanel)) {
            JOptionPane.showMessageDialog(this, "Добро пожаловать в ВАО");
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        /* */
    }

    @Override
    public void mousePressed(MouseEvent e) {
        /* */
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        /* */
    }

    @Override
    public void mouseExited(MouseEvent e) {
        /* */
    }
}
