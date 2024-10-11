package ru.mirea.practice.s23k0823.task2;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateComparatorGui {
    private JTextField yearField;
    private JTextField monthField;
    private JTextField dayField;
    private JTextField hourField;
    private JTextField minuteField;
    private JLabel resultLabel;

    public DateComparatorGui() {
        JFrame frame = new JFrame("Date Comparator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(8, 1));

        JLabel currentDateLabel = new JLabel("Текущая дата и время: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        frame.add(currentDateLabel);

        yearField = new JTextField("Год");
        yearField.setToolTipText("Введите год (yyyy)");
        monthField = new JTextField("Месяц");
        monthField.setToolTipText("Введите месяц (MM)");
        dayField = new JTextField("День");
        dayField.setToolTipText("Введите день (dd)");
        hourField = new JTextField("Часы");
        hourField.setToolTipText("Введите часы (HH)");
        minuteField = new JTextField("Минуты");
        minuteField.setToolTipText("Введите минуты (mm)");

        JButton compareButton = new JButton("Сравнить");
        compareButton.addActionListener(new CompareButtonListener());

        resultLabel = new JLabel("Результат сравнения: ");


        frame.add(yearField);
        frame.add(monthField);
        frame.add(dayField);
        frame.add(hourField);
        frame.add(minuteField);
        frame.add(compareButton);
        frame.add(resultLabel);

        frame.pack();
        frame.setVisible(true);
    }

    private class CompareButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int year = Integer.parseInt(yearField.getText());
                int month = Integer.parseInt(monthField.getText());
                int day = Integer.parseInt(dayField.getText());
                int hour = Integer.parseInt(hourField.getText());
                int minute = Integer.parseInt(minuteField.getText());

                LocalDateTime userInputDateTime = LocalDateTime.of(year, month, day, hour, minute);
                LocalDateTime currentDateTime = LocalDateTime.now();

                if (userInputDateTime.isBefore(currentDateTime)) {
                    resultLabel.setText("Результат сравнения: Введенная дата и время раньше текущей");
                } else if (userInputDateTime.isAfter(currentDateTime)) {
                    resultLabel.setText("Результат сравнения: Введенная дата и время позже текущей");
                } else {
                    resultLabel.setText("Результат сравнения: Введенная дата и время равна текущей");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Результат сравнения: Неверный формат даты и времени");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DateComparatorGui();
            }
        });
    }
}