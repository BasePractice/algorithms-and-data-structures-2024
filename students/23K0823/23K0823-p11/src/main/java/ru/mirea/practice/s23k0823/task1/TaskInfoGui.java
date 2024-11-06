package ru.mirea.practice.s23k0823.task1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.SwingUtilities;

public class TaskInfoGui {
    private JLabel assignmentDateLabel;
    private JLabel submissionDateLabel;

    public TaskInfoGui() {
        JFrame frame = new JFrame("ОАК приветствует на марсе");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        JLabel developerLabel = new JLabel("Разработчик: Иванов Иван");
        assignmentDateLabel = new JLabel("Дата и время получения задания: ");
        submissionDateLabel = new JLabel("Дата и время сдачи задания: ");
        frame.add(developerLabel);

        JButton receiveButton = new JButton("Получить задание");
        receiveButton.addActionListener(new ReceiveButtonListener());

        JButton submitButton = new JButton("Сдать задание");
        submitButton.addActionListener(new SubmitButtonListener());

        frame.add(assignmentDateLabel);
        frame.add(submissionDateLabel);
        frame.add(receiveButton);
        frame.add(submitButton);

        frame.pack();
        frame.setVisible(true);
    }

    private class ReceiveButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            assignmentDateLabel.setText("Задание получил разработчик Иванов Иван в " + new Date());
        }
    }

    private class SubmitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            submissionDateLabel.setText("Задание сдал разработчик Иванов Иван в " + new Date());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TaskInfoGui();
            }
        });
    }
}