package ru.mirea.practice.s23k0823.task1.task1.students;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI {
    private LabClass labClass;
    private JTextField fioField;
    private JTextField markField;
    private JTextArea outputArea;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
        createAndShowGui();
    }

    void createAndShowGui() {
        JFrame frame = new JFrame("Студенты");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));
        inputPanel.add(new JLabel("ФИО:"));
        fioField = new JTextField();
        inputPanel.add(fioField);
        inputPanel.add(new JLabel("Средний балл:"));
        markField = new JTextField();
        inputPanel.add(markField);

        JButton addButton = new JButton("Добавить студента");
        addButton.addActionListener(new AddStudentListener());
        inputPanel.add(addButton);

        JButton searchButton = new JButton("Найти студента по ФИО");
        searchButton.addActionListener(new SearchStudentListener());
        inputPanel.add(searchButton);

        JButton sortButton = new JButton("Сортировать по среднему баллу");
        sortButton.addActionListener(new SortStudentsListener());
        inputPanel.add(sortButton);

        JButton exitButton = new JButton("Выход");
        exitButton.addActionListener(new ExitListener());
        inputPanel.add(exitButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(outputArea), BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private class AddStudentListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fio = fioField.getText();
            double mark = Double.parseDouble(markField.getText());
            Student student = new Student(fio, mark);
            labClass.addStudent(student);
            outputArea.setText("Студент добавлен успешно!");
        }
    }

    private class SearchStudentListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fio = fioField.getText();
            try {
                Student student = labClass.searchStudentByFio(fio);
                outputArea.setText("Студент найден: " + student.getFio() + " - " + student.getAverageMark());
            } catch (StudentNotFoundException ex) {
                outputArea.setText("Студент с ФИО " + fio + " не найден");
            } catch (EmptyStringException ex) {
                outputArea.setText("ФИО не может быть пустым");
            }
        }
    }

    private class SortStudentsListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            labClass.sortStudentsByAverageMark();
            StringBuilder output = new StringBuilder();
            for (Student student : labClass.getStudents()) {
                output.append("Студент: ").append(student.getFio()).append(" - ").append(student.getAverageMark()).append("\n");
            }
            outputArea.setText(output.toString());
        }
    }

    private class ExitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}