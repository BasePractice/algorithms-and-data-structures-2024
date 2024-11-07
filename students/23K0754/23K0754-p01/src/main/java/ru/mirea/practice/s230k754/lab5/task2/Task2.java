package ru.mirea.practice.s230k754.lab5.task2;



import javax.swing.JFrame;

public final class Task2  {
    private Task2() {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Task1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        frame.getContentPane().add(new FigureDraw(20));

        frame.pack();
        frame.setVisible(true);

    }
}
