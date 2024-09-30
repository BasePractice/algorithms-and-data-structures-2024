package ru.mirea.practice.s230k754.lab5.task2;


import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;

public class FigureDraw extends JPanel {
    private Figure[] figures;
    private int countfigures;

    public FigureDraw(int countfigures) {
        this.countfigures = countfigures;
        setPreferredSize(new Dimension(400, 400));
        figures = new Figure[countfigures];
        for (int i = 0; i < countfigures; i++) {
            figures[i] = new Figure();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Рисуем все фигуры из массива
        for (Figure figure : figures) {
            figure.draw(g);
        }
    }

    public int getCountfigures() {
        return countfigures;
    }
}
